package com.abstrac.factory.bdd.abstractRepo;

import com.abstrac.factory.bdd.compra.CompraRepository;
import com.abstrac.factory.bdd.producto.ProductoRepository;
import com.abstrac.factory.bdd.usuario.UsuarioRepository;

public interface AbstractRepositoryFactory {
    CompraRepository getCompraRepository();


    ProductoRepository getProductoRepository();

    UsuarioRepository getUsuarioRepository();
}
