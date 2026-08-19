package br.edu.nexuslog;

import br.edu.nexuslog.domain.Shipment;
import br.edu.nexuslog.enums.FreightType;
import br.edu.nexuslog.service.NotificationService;
import br.edu.nexuslog.service.SimpleFreightService;

public class Main {
    public static void main(String[] args) {
        //1. Instanciação do domínio validado
        Shipment shipment = new Shipment("REQ-001", "João Silva", 10.5);

        //2. Execução do serviço de cálculo isolado
        SimpleFreightService freightService = new SimpleFreightService();
        double price = freightService.calculate(shipment, FreightType.EXPRESSO);

        //3. Execução do serviço de notificação isolado
        NotificationService notificationService = new NotificationService();
        notificationService.sendStatus(shipment.customerName(), "Frete calculado no valor de R$ " + price);
    }
}
