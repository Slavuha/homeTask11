package com.company;

class BigDog extends Dog implements Pet {


    public BigDog(String name) {
        super(name);
    }
    @Override
    public void feed(){
    }
    @Override
    public void walk(){
    }
    @Override
    public void play() {
    }
    public void greets() {
        System.out.println("Woow");

    }

    public void greetsAnotherDog() {
        System.out.println("Wooooow");

    }

    public void greetsAnotherBigDog() {
        System.out.println("Wooo00000oow");

    }
}
