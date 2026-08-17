package br.edu.nexuslog.shipping;

public class FreightCalculator {

    public double calculate(FreightType freightType, double weightKg) {

        return switch (freightType) {
            case ECONOMICO -> 10.0 + weightKg * 1.5;
            case EXPRESSO -> 25.0 + weightKg * 3.0;
            case PRIORITARIO -> 40.0 + weightKg * 4.5;
        };
    }
}