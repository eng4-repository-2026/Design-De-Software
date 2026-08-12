/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: MotorcycleCreator.java
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
// Classe concreta: implementa uma responsabilidade específica dentro do desenho.
public class MotorcycleCreator extends VehicleCreator {
    public TransportVehicle create() { return new Motorcycle(); }
}
