package com.app;

import com.abstrac.factory.muebles.escritorio.Escritorio;
import com.abstrac.factory.muebles.factory.AbstractFactoryMuebles;
import com.abstrac.factory.muebles.factory.MueblesFactoryMaker;
import com.abstrac.factory.muebles.silla.Silla;

public class MainApp {
    public static void main(String[] args) {
        String parametro = "steam";
        AbstractFactoryMuebles getMuebles = MueblesFactoryMaker.getFactory(parametro);
        Escritorio escritorio =  getMuebles.crearEscritorio(parametro);
        escritorio.typeEscritorio();
        Silla silla = getMuebles.crearSilla(parametro);
        silla.typeSilla();
    }
}
