/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: SimpleFreightService.java
 *
 * Finalidade:
 * SERVIÇO DIDÁTICO: etapa intermediária de separação de responsabilidades usada antes da introdução formal dos padrões.
 *
 * Leitura recomendada em aula:
 * 1) identifique a responsabilidade desta classe;
 * 2) identifique de quais abstrações ela depende;
 * 3) observe o que mudaria se surgisse uma nova regra/integração;
 * 4) relacione a decisão a coesão, acoplamento, SOLID e/ou padrão de projeto.
 */
package br.edu.nexuslog.service;

import br.edu.nexuslog.domain.Shipment;

// Classe concreta: implementa uma responsabilidade específica dentro do desenho.

public class SimpleFreightService {
    public double calculate(Shipment shipment, String freightType) {
        // Etapa intermediária: ainda há seleção por tipo. Mais adiante Strategy elimina esse ponto de crescimento.
        return switch (freightType) {
            case "ECONOMICO" -> 10.0 + shipment.weightKg() * 1.5;
            case "EXPRESSO" -> 25.0 + shipment.weightKg() * 3.0;
            case "PRIORITARIO" -> 40.0 + shipment.weightKg() * 4.5;
            default -> throw new IllegalArgumentException("Modalidade inválida");
        };
    }
}
