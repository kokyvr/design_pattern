package com.abstrac.factory.bdd.mongodb;

import com.abstrac.factory.bdd.producto.ProductoRepository;

public class ProductoMongoRepository implements ProductoRepository {
    @Override
    public String guardaProducto(String producto) {
        return String.format("Guardando %s en MongoDB" , producto);
    }
}
