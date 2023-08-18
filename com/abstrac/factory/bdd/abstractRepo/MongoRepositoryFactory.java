package com.abstrac.factory.bdd.abstractRepo;

import com.abstrac.factory.bdd.compra.CompraRepository;
import com.abstrac.factory.bdd.mongodb.CompraMongoRepository;
import com.abstrac.factory.bdd.mongodb.ProductoMongoRepository;
import com.abstrac.factory.bdd.mongodb.UsuarioMongoDBRepository;
import com.abstrac.factory.bdd.producto.ProductoRepository;
import com.abstrac.factory.bdd.usuario.UsuarioRepository;

public class MongoRepositoryFactory implements AbstractRepositoryFactory {
    @Override
    public CompraRepository getCompraRepository() {
        return new CompraMongoRepository();
    }

    @Override
    public ProductoRepository getProductoRepository() {
        return new ProductoMongoRepository();
    }

    @Override
    public UsuarioRepository getUsuarioRepository() {
        return new UsuarioMongoDBRepository();
    }
}
