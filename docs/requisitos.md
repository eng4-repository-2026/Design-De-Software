# ADR-0001: Diagnóstico de Performance — Tela "Ordens de Produção (nova)" — VASAP

## Status

Aceito

## Contexto

A lentidão não vem de uma query pesada. Vem de um N+1 nativo: o listener OrdemProducaoHtmlCrudListener recalcula, para cada linha do grid, um conjunto de campos calculados (saldo, validação de versão, tempo previsto etc.), disparando ~16 sub-consultas por registro.

Nesta captura:

| Métrica                           | Valor                                |
| --------------------------------- | ------------------------------------ |
| Registros de OP processados       | **10.656**                           |
| Total de sub-consultas disparadas | **170.811**                          |
| Sub-consultas por registro        | **~16**                              |
| Tempo de SQL somado               | **195 s (3,25 min)**                 |
| Query individual mais lenta       | **188 ms** (nenhuma acima de 500 ms) |
| Top-2 campos calculados           | **58 %** de todo o SQL               |
| Top-10 padrões                    | **99,6 %** de todo o SQL             |

É "morte por mil cortes": cada query é rápida (média 5 ms), mas são 170 mil delas. Confirma a hipótese: cada linha carrega dezenas de sub-dados que, na maioria dos casos, o usuário não vai usar ao apenas listar.

## Decisão

Adotar uma estratégia de redução do volume de processamento por linha na tela de Ordens de Produção, priorizando filtros de visualização e remoção de cálculos desnecessários durante o carregamento inicial.

A abordagem prática é reduzir o número de linhas listadas por padrão, aplicando filtros como STATUSPROC nas ordens abertas e/ou janela de data menor, de modo a diminuir drasticamente o número de sub-consultas disparadas. Em paralelo, a arquitetura da tela deve evitar executar cálculos pesados para cada linha quando a intenção principal é apenas listar registros.

## Consequências

- Redução significativa da latência percebida pelo usuário ao carregar a tela.
- Menor volume de round-trips e menor pressão sobre o banco e o servidor de aplicação.
- O ganho é maior quando o número de linhas exibidas é reduzido, o que melhora a experiência em cenários de uso comum.
- A melhoria estrutural completa depende de mudanças no comportamento do listener e dos cálculos nativos da tela, o que pode exigir intervenção da Sankhya.
