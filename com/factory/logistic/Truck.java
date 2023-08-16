package com.factory.logistic;

import com.factory.logistic.Transport;

public class Truck implements Transport {
    @Override
    public void delivery() {
        System.out.println("Truckt delivery");
    }
}
