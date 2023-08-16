package com.factory.factura;

public class FactoryFactura {

    private FactoryFactura(){

    }

    public static Factura getFactoryFactura(String type,int id , double importe){
        Factura factura = null;
        if(type.equalsIgnoreCase("FacturaIVA")){
            factura = new FacturaIVA(id,importe);
            return factura;
        }else if(type.equalsIgnoreCase("FacturaIVAReducida")){
            factura = new FacturaIVAReducida(id,importe);
            return factura;
        }
        return factura;
    }
}
