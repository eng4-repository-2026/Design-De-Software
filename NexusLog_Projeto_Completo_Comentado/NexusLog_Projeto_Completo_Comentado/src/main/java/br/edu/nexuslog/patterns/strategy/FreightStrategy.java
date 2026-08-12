/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: FreightStrategy.java
 *
 * Finalidade:
 * STRATEGY: encapsula algoritmos intercambiáveis de cálculo de frete. O cliente depende da abstração FreightStrategy, não de condicionais espalhadas.
 *
 * Leitura recomendada em aula:
 * 1) identifique a responsabilidade desta classe;
 * 2) identifique de quais abstrações ela depende;
 * 3) observe o que mudaria se surgisse uma nova regra/integração;
 * 4) relacione a decisão a coesão, acoplamento, SOLID e/ou padrão de projeto.
 */
package br.edu.nexuslog.patterns.strategy;

import br.edu.nexuslog.domain.Shipment;

// Contrato: define o que os clientes podem usar sem conhecer a implementação concreta.

public interface FreightStrategy {
    double calculate(Shipment shipment);
    String name();
}
