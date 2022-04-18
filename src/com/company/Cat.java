package com.company;

class Cat extends Animal implements Pet {

    @Override
    public void greets() {
        System.out.println("Cat" + getName() + "says Meoy");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Feeding cat" + getName());

    }

    @Override
    public void walk() {
        System.out.println("Walking cat" + getName());

    }

    @Override
    public void play() {
        System.out.println("Playing with cat" + getName());

    }
}
