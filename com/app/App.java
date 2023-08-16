package com.app;

import com.factory.factura.FactoryFactura;
import com.factory.factura.Factura;
import com.factory.logistic.Logistics;
import com.factory.logistic.Transport;

public class App {
    public static void main(String[] args) {
        //getTransport();
        getFactura();
    }

    private static void getFactura() {
        Factura factura = FactoryFactura.getFactoryFactura("FacturaIVA",1,200.125);
        System.out.println("Factura IVA : " + factura.calcularIVA());

        factura = FactoryFactura.getFactoryFactura("FacturaIVAReducida",2,200.125);
        System.out.println("Factura IVA Reducida : " + factura.calcularIVA());
    }

    private static void getTransport(){
        Transport transport = Logistics.getTransport("Ship");
        transport.delivery();
    }
}
