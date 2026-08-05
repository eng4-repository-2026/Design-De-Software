# Design de Software

Repositório com as atividades e exercícios da disciplina Design de Software. Cada atividade fica em seu próprio arquivo dentro de `docs/`, seguindo o formato de **ADR** (Architecture Decision Record): contexto, decisão e consequências.

## Tecnologias

- Markdown para toda a documentação
- ADR (Architecture Decision Record) como formato padrão dos registros de decisão
- IntelliJ IDEA como ambiente de desenvolvimento

## Estrutura do projeto

```
docs/
├── requisitos.md              # ADR-0001 — Diagnóstico de performance (VASAP)
└── adrs/
    ├── ADR-000X-Exemplo.md    # Template em branco para novos ADRs
    ├── ADR-001.md             # ADR-0002 — Fila da cantina: reserva de prato pelo app
    └── MAPAC-001.md           # Mapa de contexto do cenário da cantina
```

## Atividades

| Arquivo | Assunto | Detalhes |
| --- | --- | --- |
| `docs/requisitos.md` | ADR-0001 — Diagnóstico de performance da tela "Ordens de Produção (nova)" no VASAP: N+1 de campos calculados | [ADR](docs/requisitos.md) |
| `docs/adrs/MAPAC-001.md` | Mapa de contexto do cenário da cantina: pessoas, restrições e decisões em aberto | [Mapa](docs/adrs/MAPAC-001.md) |
| `docs/adrs/ADR-001.md` | ADR-0002 — Fila da cantina: escopo da 1ª versão do app de reserva, aplicando os princípios de Hooker | [ADR](docs/adrs/ADR-001.md) |
| `docs/adrs/ADR-000X-Exemplo.md` | Template em branco usado como base para novos ADRs | [Template](docs/adrs/ADR-000X-Exemplo.md) |

O mapa de contexto (`MAPAC-001`) é o insumo do ADR-0002: ele descreve o cenário e as restrições que sustentam as decisões registradas no ADR.

## Como consultar

Todos os documentos são Markdown puro — basta abrir pelo IntelliJ IDEA (que renderiza o preview) ou direto pelo GitHub.

Para criar um novo registro de decisão, copie o template e numere o arquivo em sequência:

```
cp docs/adrs/ADR-000X-Exemplo.md docs/adrs/ADR-00N.md
```

Cada ADR mantém as seções **Status**, **Contexto**, **Decisão** e **Consequências**.
