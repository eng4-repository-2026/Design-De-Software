/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: VehicleCreator.java
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
// Classe abstrata: mantém o fluxo comum e deixa um ponto de variação para subclasses.
public abstract class VehicleCreator {
    public abstract TransportVehicle create();
    public String planRoute() {
        TransportVehicle vehicle = create();
        return "Rota planejada com " + vehicle.description();
    }
}
