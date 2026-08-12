# Os 6 padrões no NexusLog

| Padrão | Problema resolvido | Onde está |
|---|---|---|
| Strategy | múltiplas regras de cálculo de frete | `patterns/strategy` |
| Factory Method | criação do veículo adequado | `patterns/factorymethod` |
| Observer | avisar interessados sobre mudança de status | `patterns/observer` |
| Abstract Factory | criar família compatível de etiqueta + rastreamento | `patterns/abstractfactory` |
| Adapter | compatibilizar API externa com interface interna | `integration/CorreiosAdapter` |
| Facade | simplificar o fluxo completo de expedição | `patterns/facade` |

## Regra didática
O padrão só deve ser aplicado quando houver um problema concreto. O objetivo não é "usar seis padrões porque existem", e sim justificar o que cada um resolve.
