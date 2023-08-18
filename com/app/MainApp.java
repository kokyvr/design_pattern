package com.app;

import com.abstrac.factory.bdd.muebleriaMaker.RepositoryFactoryMaker;
import com.abstrac.factory.bdd.muebleriaMaker.TipoRepositorio;
import com.abstrac.factory.bdd.abstractRepo.AbstractRepositoryFactory;
import com.abstrac.factory.bdd.producto.ProductoRepository;
import com.abstrac.factory.bdd.muebles.escritorio.Escritorio;
import com.abstrac.factory.bdd.muebles.factory.AbstractFactoryMuebles;
import com.abstrac.factory.bdd.muebles.factory.MueblesFactoryMaker;
import com.abstrac.factory.bdd.muebles.silla.Silla;

public class MainApp {
    public static void main(String[] args) {
        String parametro = "steam";
        AbstractFactoryMuebles getMuebles = MueblesFactoryMaker.getFactory(parametro);
        Escritorio escritorio =  getMuebles.crearEscritorio(parametro);
        escritorio.typeEscritorio();
        Silla silla = getMuebles.crearSilla(parametro);
        silla.typeSilla();

        System.out.println("******************************* INICIO BD RELACION OR MONGO *************************");
        AbstractRepositoryFactory repo = RepositoryFactoryMaker.getRepositoryFactory(TipoRepositorio.MONGO_DB);
        ProductoRepository producto = repo.getProductoRepository();
        System.out.println(TipoRepositorio.RELACIONAL.toString() + " - " + producto.guardaProducto("CASACA"));


    }
}
