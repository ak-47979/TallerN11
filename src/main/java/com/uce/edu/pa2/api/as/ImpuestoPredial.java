package com.uce.edu.pa2.api.as;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class ImpuestoPredial implements Impuesto{

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Impuesto Predial");
       
        double impuesto = valor * 0.015;
        double total = valor + impuesto;
        return total;
    }

    
}