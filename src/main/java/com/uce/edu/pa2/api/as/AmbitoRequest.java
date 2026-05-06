package com.uce.edu.pa2.api.as;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class AmbitoRequest {

    private int contador = 0;

     public int incrementar(){
        return ++contador;
    }
}
