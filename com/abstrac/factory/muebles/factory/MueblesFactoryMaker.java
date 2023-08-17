package com.abstrac.factory.muebles.factory;

public class MueblesFactoryMaker {
    private MueblesFactoryMaker(){

    }

    public static AbstractFactoryMuebles getFactory(String parametros){
        AbstractFactoryMuebles muebles = null;
        if("steam".equalsIgnoreCase(parametros)){
            muebles = new FabricaMueblesSteamPunk();
            return muebles;
        }
        else if("rustico".equalsIgnoreCase(parametros)){
            muebles = new FabricaMueblesRusticos();
            return muebles;
        } else if ("minimalista".equalsIgnoreCase(parametros)) {
            muebles = new FabricaMueblesMinimalista();
            return muebles;

        }

        return muebles;

    }

}
