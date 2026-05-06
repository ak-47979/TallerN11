package com.uce.edu.pa2.api.as;
import jakarta.enterprise.context.ApplicationScoped;

import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorImpuestoService {
    
     @Inject
    private Instance<Impuesto> impuestos;
    
    public void procesar(Compra compra){
        double total = compra.getSubTotal();
        
        for (Impuesto imp : impuestos) {
            total = imp.aplicar(total);
        }
        
        compra.setTotal(total);
        System.out.println("Precio despues de Impuesto: "+ compra.getTotal());
    }
}