package com.factory.logistic;

public class Ship implements Transport {
    @Override
    public void delivery() {
        System.out.println("Delivery Ship");
    }
}
