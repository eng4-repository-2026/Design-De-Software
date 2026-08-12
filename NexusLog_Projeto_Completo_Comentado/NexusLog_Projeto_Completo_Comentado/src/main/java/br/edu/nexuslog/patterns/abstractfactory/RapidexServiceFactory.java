/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: RapidexServiceFactory.java
 *
 * Finalidade:
 * ABSTRACT FACTORY: cria uma família coerente de serviços relacionados (ex.: etiqueta + rastreamento) para um mesmo operador logístico.
 *
 * Leitura recomendada em aula:
 * 1) identifique a responsabilidade desta classe;
 * 2) identifique de quais abstrações ela depende;
 * 3) observe o que mudaria se surgisse uma nova regra/integração;
 * 4) relacione a decisão a coesão, acoplamento, SOLID e/ou padrão de projeto.
 */
package br.edu.nexuslog.patterns.abstractfactory;
// Classe concreta: implementa uma responsabilidade específica dentro do desenho.
public class RapidexServiceFactory implements LogisticsServiceFactory {
    public LabelService createLabelService() {
        return shipment -> "RDX-LABEL-" + shipment.id();
    }
    public TrackingService createTrackingService() {
        return code -> "COLETA_AGENDADA:" + code;
    }
}
