package com.uce.edu.pa2.api.as;
import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

public class ImpuestoIEPS implements Impuesto{

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Impuesto IEPS");

        double impuesto = valor * 0.26;
        double total = valor + impuesto;
        return total;
    }

}
