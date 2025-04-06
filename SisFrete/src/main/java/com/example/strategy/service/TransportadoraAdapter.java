package com.example.strategy.service;

import org.springframework.stereotype.Component;

@Component
public class TransportadoraAdapter implements FreteStrategy {

    private final TransportadoraExternaAPI externaAPI;

    public TransportadoraAdapter() {
        this.externaAPI = new TransportadoraExternaAPI();
    }

    @Override
    public double calcular(double peso) {
        return externaAPI.custoEntrega(peso);
    }

    @Override
    public String tipoFrete() {
        return "Transportadora Externa";
    }
}
