package com.factory.logistic;

public class Logistics {

    private Logistics(){}

    public static Transport getTransport(String text){
        Transport transporte = null;
        if(text.equalsIgnoreCase("Ship")){
            transporte = new Ship();
            return transporte;
        }
        else if(text.equalsIgnoreCase("Truck")){
            return transporte;
        }

        return transporte;

    }
}
