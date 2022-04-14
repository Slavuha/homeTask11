package com.company;

public class Lion extends Animal implements WildAnimal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public int hunting() {
        System.out.println("Lion goes hunting" + getName());
        return 0;
    }
    public int greets(){
        System.out.println("Lion says: Roar" + getName());
        return 0;
    }

    class Wolf extends Animal implements WildAnimal{

        public Wolf(String name) {
            super(name);
        }

        @Override
        public int hunting() {
            System.out.println("Wolf" + getName() + "goes hunting");
            return 0;
        }

    public int greets() {
        System.out.println("Wolf says Hawoo" + getName());
        return 0;

    }
    }
}
