package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CompraService {

    @Inject
    private ProcesadorImpuestoService impuestoService;
    @Inject
    private ProcesadorCompraService compraService;

    public void aplicar(Compra compra){
        this.impuestoService.procesar(compra);
        this.compraService.procesar(compra);
        System.out.println("Su valor a pagar es:" + compra.getTotal());
    }
}