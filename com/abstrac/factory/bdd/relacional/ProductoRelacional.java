package com.abstrac.factory.bdd.relacional;

import com.abstrac.factory.bdd.compra.CompraRepository;
import com.abstrac.factory.bdd.producto.ProductoRepository;

public class ProductoRelacional implements ProductoRepository {

    @Override
    public String guardaProducto(String producto) {
        return String.format("Guardando %s en BD Relacional ",producto);
    }
}
