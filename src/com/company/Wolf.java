package com.company;

class Wolf extends Animal implements WildAnimal {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void hunting() {
        System.out.println("Wolf" + getName() + "goes hunting");

    }

    public void greets() {
        System.out.println("Wolf says Hawoo" + getName());


    }
}
