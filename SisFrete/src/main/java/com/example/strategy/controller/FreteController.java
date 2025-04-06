package com.example.strategy.controller;

import com.example.strategy.service.FreteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frete")
public class FreteController {
    private final FreteService freteService;
    public FreteController(FreteService freteService){
        this.freteService = freteService;
    }

    @GetMapping
    public String calcular(@RequestParam String tipoFrete, @RequestParam double peso){
        double valor = freteService.calcular(tipoFrete, peso);
        return "Frete (" + tipoFrete + ") para " + peso + "kg: R$" + valor;
    }
}
