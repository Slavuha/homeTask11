package com.company;

public abstract class Animal {
    private String name;

    public abstract void  greets();

    public Animal(String name) {
        this.name=name;

    }


    public String getName() {
        return name;
    }
}








