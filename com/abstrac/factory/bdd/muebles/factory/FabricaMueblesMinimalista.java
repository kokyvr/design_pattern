package com.abstrac.factory.bdd.muebles.factory;

import com.abstrac.factory.bdd.muebles.escritorio.Escritorio;
import com.abstrac.factory.bdd.muebles.escritorio.EscritorioMinimalista;
import com.abstrac.factory.bdd.muebles.mesa.Mesa;
import com.abstrac.factory.bdd.muebles.mesa.MesaMinimalista;
import com.abstrac.factory.bdd.muebles.silla.Silla;
import com.abstrac.factory.bdd.muebles.silla.SillaMinimalista;
import com.abstrac.factory.bdd.muebles.sofa.Sofa;
import com.abstrac.factory.bdd.muebles.sofa.SofaMinimalista;

public class FabricaMueblesMinimalista implements AbstractFactoryMuebles{
    @Override
    public Silla crearSilla(String parametros) {
        return new SillaMinimalista();
    }

    @Override
    public Mesa crearMesa(String parametros) {
        return new MesaMinimalista();
    }

    @Override
    public Sofa crearSofa(String parametros) {
        return new SofaMinimalista();
    }

    @Override
    public Escritorio crearEscritorio(String parametros) {
        return new EscritorioMinimalista();
    }
}
