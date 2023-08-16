package com.factory.factura;

public class FacturaIVA extends Factura {

    public FacturaIVA(int id, Double importe) {
        super(id, importe);
    }

    @Override
    public double calcularIVA() {
        return super.getImporte() * 1.07;
    }
}
