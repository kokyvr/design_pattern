package com.abstrac.factory.bdd.relacional;

import com.abstrac.factory.bdd.compra.CompraRepository;

public class CompraRelacional implements CompraRepository {
    @Override
    public String guardarCompra(String compra) {
        return String.format("Guardando %s en  una BD Relacional",compra);
    }
}
