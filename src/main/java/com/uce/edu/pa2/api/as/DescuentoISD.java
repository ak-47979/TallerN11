package com.uce.edu.pa2.api.as;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class DescuentoISD  implements Descuento{

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando DescuentoISD");
        double valorDescontar = valor*0.10;
        return valor - valorDescontar;    

    }
    

}


