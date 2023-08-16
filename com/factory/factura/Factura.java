package com.factory.factura;

public abstract class Factura {
    public Factura(int id, Double importe) {
        this.id = id;
        this.importe = importe;
    }

    private int id;
    private Double importe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public abstract double calcularIVA();
}
