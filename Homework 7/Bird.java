package com.company;

public abstract class Bird {

    String feathers;
    int year;
    abstract void fly();

    public Bird(String feathers) {
        this.feathers = feathers;
    }
    public Bird(){
    }
    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    }
