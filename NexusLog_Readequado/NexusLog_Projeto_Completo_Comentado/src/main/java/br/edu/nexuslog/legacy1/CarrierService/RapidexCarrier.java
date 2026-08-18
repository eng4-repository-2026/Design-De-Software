package br.edu.nexuslog.legacy.CarrierService;

public class RapidexCarrier implements CarrierService {

    @Override
    public void ship() {
        System.out.println("Chamando API Rapidex...");
    }
}
