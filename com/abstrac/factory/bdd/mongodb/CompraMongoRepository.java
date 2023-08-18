package com.abstrac.factory.bdd.mongodb;

import com.abstrac.factory.bdd.compra.CompraRepository;

public class CompraMongoRepository implements CompraRepository {
    @Override
    public String guardarCompra(String compra) {
        return String.format("Guardando %s en MongoDB" , compra);
    }
}
