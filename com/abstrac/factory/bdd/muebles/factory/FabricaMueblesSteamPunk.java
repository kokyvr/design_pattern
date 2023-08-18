package com.abstrac.factory.muebles.factory;

import com.abstrac.factory.muebles.escritorio.Escritorio;
import com.abstrac.factory.muebles.escritorio.EscritorioMinimalista;
import com.abstrac.factory.muebles.escritorio.EscritorioRustico;
import com.abstrac.factory.muebles.escritorio.EscritorioSteamPunk;
import com.abstrac.factory.muebles.mesa.Mesa;
import com.abstrac.factory.muebles.mesa.MesaMinimalista;
import com.abstrac.factory.muebles.mesa.MesaRustica;
import com.abstrac.factory.muebles.mesa.MesaSteamPunk;
import com.abstrac.factory.muebles.silla.Silla;
import com.abstrac.factory.muebles.silla.SillaMinimalista;
import com.abstrac.factory.muebles.silla.SillaRustica;
import com.abstrac.factory.muebles.silla.SillaSteampunk;
import com.abstrac.factory.muebles.sofa.Sofa;
import com.abstrac.factory.muebles.sofa.SofaMinimalista;
import com.abstrac.factory.muebles.sofa.SofaRustico;
import com.abstrac.factory.muebles.sofa.SofaSteamPunk;

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
