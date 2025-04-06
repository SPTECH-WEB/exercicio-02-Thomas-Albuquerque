package com.example.strategy.service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategies;
    public FreteService(List<FreteStrategy> estrategies){
        this.estrategies = estrategies;
    }

    public double calcular(String tipoFrete, double peso){
        System.out.println("Tipo recebido: " + tipoFrete);
        System.out.println("Tipos disponíveis:");
        estrategies.forEach(e -> System.out.println("- " + e.tipoFrete()));

        return estrategies.stream()
                .filter(frete -> frete.tipoFrete().equalsIgnoreCase(tipoFrete))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo de frete não encontrado"))
                .calcular(peso);
    }
}
