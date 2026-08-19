package main.java.br.edu.nexuslog;

import main.java.br.edu.nexuslog.domain.Shipment;
import main.java.br.edu.nexuslog.enums.FreightType;
import main.java.br.edu.nexuslog.service.NotificationService;
import main.java.br.edu.nexuslog.service.SimpleFreightService;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciação do Domínio validado (peso deve ser maior que 0)
        Shipment shipment = new Shipment("REQ-001", "João Silva", 10.5);

        // 2. Execução do Serviço de Cálculo isolado
        SimpleFreightService freightService = new SimpleFreightService();
        double price = freightService.calculate(shipment, FreightType.EXPRESSO);

        // 3. Execução do Serviço de Notificação isolado
        NotificationService notificationService = new NotificationService();
        notificationService.sendStatus(shipment.customerName(), "Frete calculado no valor de R$ " + price);
    }
}
