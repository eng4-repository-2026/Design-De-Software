/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: PriorityFreight.java
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
// Classe concreta: implementa uma responsabilidade específica dentro do desenho.
public class PriorityFreight implements FreightStrategy {
    public double calculate(Shipment shipment) { return 40.0 + shipment.weightKg() * 4.5; }
    public String name() { return "PRIORITARIO"; }
}
