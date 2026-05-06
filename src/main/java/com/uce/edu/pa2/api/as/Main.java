package com.uce.edu.pa2.api.as;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.control.ActivateRequestContext;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain

public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);

    }

    public static class App implements QuarkusApplication {

        @Inject
        private CompraService compraService;
        

        @Override
        public int run(String... args) throws Exception {

            Compra comp1 = new Compra("Andy Suquilandi", Double.valueOf(100));
            

            this.compraService.aplicar(comp1);


            return 0;
        }
    }
}
