package com.abstrac.factory.muebles.factory;

import com.abstrac.factory.muebles.escritorio.Escritorio;
import com.abstrac.factory.muebles.escritorio.EscritorioRustico;
import com.abstrac.factory.muebles.mesa.Mesa;
import com.abstrac.factory.muebles.mesa.MesaRustica;
import com.abstrac.factory.muebles.silla.Silla;
import com.abstrac.factory.muebles.silla.SillaRustica;
import com.abstrac.factory.muebles.sofa.Sofa;
import com.abstrac.factory.muebles.sofa.SofaRustico;

public class FabricaMueblesRusticos implements AbstractFactoryMuebles{
    @Override
    public Silla crearSilla(String parametros) {
        return new SillaRustica();
    }

    @Override
    public Mesa crearMesa(String parametros) {
        return new MesaRustica();
    }

    @Override
    public Sofa crearSofa(String parametros) {
        return new SofaRustico();
    }

    @Override
    public Escritorio crearEscritorio(String parametros) {
        return new EscritorioRustico();
    }
}
