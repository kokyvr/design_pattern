package com.abstrac.factory.bdd.muebles.factory;

import com.abstrac.factory.bdd.muebles.escritorio.Escritorio;
import com.abstrac.factory.bdd.muebles.mesa.Mesa;
import com.abstrac.factory.bdd.muebles.silla.Silla;
import com.abstrac.factory.bdd.muebles.sofa.Sofa;

public interface AbstractFactoryMuebles {
    Silla crearSilla(String parametros);

    Mesa crearMesa(String parametros);

    Sofa crearSofa(String parametros);

    Escritorio crearEscritorio(String parametros);
}
