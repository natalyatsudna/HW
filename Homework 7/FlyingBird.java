package com.company;

public class FlyingBird extends Bird {

    @Override
    void fly() {
        System.out.println("fly");
    }
    public FlyingBird() {
    }
    public FlyingBird(String feathers) {
        super(feathers);
    }
}
