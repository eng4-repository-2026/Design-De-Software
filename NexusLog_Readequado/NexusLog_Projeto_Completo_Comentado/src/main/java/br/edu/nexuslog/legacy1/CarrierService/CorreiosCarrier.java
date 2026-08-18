package br.edu.nexuslog.legacy.CarrierService;

public class CorreiosCarrier implements CarrierService {

    @Override
    public void ship() {
        System.out.println("Chamando API Correios...");
    }
}
