/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: DeliveryObserver.java
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
import br.edu.nexuslog.domain.Delivery;
// Contrato: define o que os clientes podem usar sem conhecer a implementação concreta.
public interface DeliveryObserver {
    void onStatusChanged(Delivery delivery);
}
