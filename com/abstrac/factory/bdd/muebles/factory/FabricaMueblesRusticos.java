package com.abstrac.factory.bdd.muebles.factory;

import com.abstrac.factory.bdd.muebles.escritorio.Escritorio;
import com.abstrac.factory.bdd.muebles.escritorio.EscritorioRustico;
import com.abstrac.factory.bdd.muebles.mesa.Mesa;
import com.abstrac.factory.bdd.muebles.mesa.MesaRustica;
import com.abstrac.factory.bdd.muebles.silla.Silla;
import com.abstrac.factory.bdd.muebles.silla.SillaRustica;
import com.abstrac.factory.bdd.muebles.sofa.Sofa;
import com.abstrac.factory.bdd.muebles.sofa.SofaRustico;

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
