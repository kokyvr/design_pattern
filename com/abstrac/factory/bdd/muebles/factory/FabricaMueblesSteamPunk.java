package com.abstrac.factory.bdd.muebles.factory;

import com.abstrac.factory.bdd.muebles.escritorio.Escritorio;
import com.abstrac.factory.bdd.muebles.escritorio.EscritorioSteamPunk;
import com.abstrac.factory.bdd.muebles.mesa.Mesa;
import com.abstrac.factory.bdd.muebles.mesa.MesaSteamPunk;
import com.abstrac.factory.bdd.muebles.silla.Silla;
import com.abstrac.factory.bdd.muebles.silla.SillaSteampunk;
import com.abstrac.factory.bdd.muebles.sofa.Sofa;
import com.abstrac.factory.bdd.muebles.sofa.SofaSteamPunk;

public class FabricaMueblesSteamPunk implements AbstractFactoryMuebles{

    @Override
    public Silla crearSilla(String parametros) {

        return new SillaSteampunk();
    }

    @Override
    public Mesa crearMesa(String parametros) {

        return new MesaSteamPunk();
    }

    @Override
    public Sofa crearSofa(String parametros) {

        return new SofaSteamPunk();
    }

    @Override
    public Escritorio crearEscritorio(String parametros) {

        return new EscritorioSteamPunk();
    }
}
