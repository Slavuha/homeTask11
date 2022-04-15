package com.company;

public class Lion extends Animal implements WildAnimal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void hunting() {
        System.out.println("Lion goes hunting" + getName());

    }
    public void greets(){
        System.out.println("Lion says: Roar" + getName());

    }

}
