package com.company;

public class NonFlyingBird extends Bird {

    @Override
    void fly() {
        System.out.println("not fly");
    }

    public NonFlyingBird(String feathers) {
        super(feathers);
    }

    public NonFlyingBird() {

    }
}
