package com.factory.factura;

public class FacturaIVAReducida extends Factura{


    public FacturaIVAReducida(int id, Double importe) {
        super(id, importe);
    }

    @Override
    public double calcularIVA() {
        return super.getImporte() * 1.21;
    }
}
