/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: DeliveryEventPublisher.java
 *
 * Finalidade:
 * OBSERVER: permite que interessados sejam notificados quando o estado de uma entrega muda, sem acoplar Delivery a canais específicos.
 *
 * Leitura recomendada em aula:
 * 1) identifique a responsabilidade desta classe;
 * 2) identifique de quais abstrações ela depende;
 * 3) observe o que mudaria se surgisse uma nova regra/integração;
 * 4) relacione a decisão a coesão, acoplamento, SOLID e/ou padrão de projeto.
 */
package br.edu.nexuslog.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import br.edu.nexuslog.domain.Delivery;
import br.edu.nexuslog.domain.DeliveryStatus;

// Classe concreta: implementa uma responsabilidade específica dentro do desenho.

public class DeliveryEventPublisher {
    // Dependência/estado obrigatório mantido como `final`: favorece objeto estável após a construção.
    private final List<DeliveryObserver> observers = new ArrayList<>();

    public void subscribe(DeliveryObserver observer) { observers.add(observer); }

    public void changeStatus(Delivery delivery, DeliveryStatus status) {
        delivery.changeStatus(status);
        // Observer: o publicador percorre inscritos sem conhecer a regra interna de cada um.
        for (DeliveryObserver observer : observers) observer.onStatusChanged(delivery);
    }
}
