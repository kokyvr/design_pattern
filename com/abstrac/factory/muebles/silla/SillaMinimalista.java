package com.abstrac.factory.muebles.silla;

import com.abstrac.factory.muebles.silla.Silla;

public class SillaMinimalista implements Silla {
    @Override
    public void typeSilla() {
        System.out.println("Silla minimalista");
    }
}
