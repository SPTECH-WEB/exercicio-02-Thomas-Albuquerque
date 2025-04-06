package com.example.strategy.service;
import org.springframework.stereotype.Component;

@Component
public class EntregaExpress implements  FreteStrategy{
    @Override
    public double calcular(double peso) {
        return 1.0 * peso;
    }

    @Override
    public String tipoFrete() {
        return "Entrega Expressa";
    }
}
