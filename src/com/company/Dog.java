package com.company;

class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Dog" + getName()+ " says: Woof");

    }

    public void greets (Dog dog) {
        System.out.println("Woooof");
    }

    public void feed() {
        System.out.println("Feeding dog" + getName());

    }

    public void walk() {
        System.out.println("Walking dog"+getName());

    }

    public void play() {
        System.out.println("Playing with dog" + getName());

    }

}
