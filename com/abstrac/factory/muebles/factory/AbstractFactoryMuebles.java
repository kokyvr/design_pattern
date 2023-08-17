package com.abstrac.factory.muebles.factory;

import com.abstrac.factory.muebles.escritorio.Escritorio;
import com.abstrac.factory.muebles.mesa.Mesa;
import com.abstrac.factory.muebles.silla.Silla;
import com.abstrac.factory.muebles.sofa.Sofa;

public interface AbstractFactoryMuebles {
    Silla crearSilla(String parametros);

    Mesa crearMesa(String parametros);

    Sofa crearSofa(String parametros);

    Escritorio crearEscritorio(String parametros);
}
