/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: NexusLogFacade.java
 *
 * Finalidade:
 * FACADE: oferece uma entrada simplificada para um fluxo que combina vários subsistemas e padrões.
 *
 * Leitura recomendada em aula:
 * 1) identifique a responsabilidade desta classe;
 * 2) identifique de quais abstrações ela depende;
 * 3) observe o que mudaria se surgisse uma nova regra/integração;
 * 4) relacione a decisão a coesão, acoplamento, SOLID e/ou padrão de projeto.
 */
package br.edu.nexuslog.patterns.facade;

import br.edu.nexuslog.domain.*;
import br.edu.nexuslog.integration.CarrierGateway;
import br.edu.nexuslog.patterns.strategy.FreightStrategy;
import br.edu.nexuslog.patterns.abstractfactory.*;
import br.edu.nexuslog.patterns.observer.*;

// Classe concreta: implementa uma responsabilidade específica dentro do desenho.

public class NexusLogFacade {
    // Dependência/estado obrigatório mantido como `final`: favorece objeto estável após a construção.
    private final CarrierGateway carrier;
    // Dependência/estado obrigatório mantido como `final`: favorece objeto estável após a construção.
    private final DeliveryEventPublisher publisher;

    public NexusLogFacade(CarrierGateway carrier, DeliveryEventPublisher publisher) {
        this.carrier = carrier;
        this.publisher = publisher;
    }

    public void process(Shipment shipment, FreightStrategy strategy, LogisticsServiceFactory factory) {
        double price = strategy.calculate(shipment);
        String tracking = carrier.createShipment(shipment);
        String label = factory.createLabelService().generate(shipment);
        String initial = factory.createTrackingService().initialStatus(tracking);

        Delivery delivery = new Delivery(shipment);
        publisher.changeStatus(delivery, DeliveryStatus.COLETADO);

        System.out.println("Frete: " + strategy.name() + " = R$ " + price);
        System.out.println("Etiqueta: " + label);
        System.out.println("Rastreamento inicial: " + initial);
    }
}
