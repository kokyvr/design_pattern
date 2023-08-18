package com.abstrac.factory.bdd.abstractRepo;

import com.abstrac.factory.bdd.compra.CompraRepository;
import com.abstrac.factory.bdd.producto.ProductoRepository;
import com.abstrac.factory.bdd.relacional.CompraRelacional;
import com.abstrac.factory.bdd.relacional.ProductoRelacional;
import com.abstrac.factory.bdd.relacional.UsuarioRelacional;
import com.abstrac.factory.bdd.usuario.UsuarioRepository;

public class RelacionalRepository implements AbstractRepositoryFactory{
    @Override
    public CompraRepository getCompraRepository() {
        return new CompraRelacional();
    }

    @Override
    public ProductoRepository getProductoRepository() {
        return new ProductoRelacional();
    }

    @Override
    public UsuarioRepository getUsuarioRepository() {
        return new UsuarioRelacional();
    }
}
