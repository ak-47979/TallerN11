package com.uce.edu.pa2.api.as;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class DescuentoSOLCA implements Descuento {

    @Override
    public double aplicar(double valor) {
            System.out.println("Aplicando DescuentoSOLCA");

        double valorADescontar = valor*0.20;
        return valor - valorADescontar;
    }

}
