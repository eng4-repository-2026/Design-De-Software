/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: TransportVehicle.java
 *
 * Finalidade:
 * FACTORY METHOD: delega a subclasses/creators a decisão sobre qual veículo concreto criar, reduzindo dependência direta de `new` no fluxo principal.
 *
 * Leitura recomendada em aula:
 * 1) identifique a responsabilidade desta classe;
 * 2) identifique de quais abstrações ela depende;
 * 3) observe o que mudaria se surgisse uma nova regra/integração;
 * 4) relacione a decisão a coesão, acoplamento, SOLID e/ou padrão de projeto.
 */
package br.edu.nexuslog.patterns.factorymethod;
// Contrato: define o que os clientes podem usar sem conhecer a implementação concreta.
public interface TransportVehicle {
    String description();
    double maxWeightKg();
}
