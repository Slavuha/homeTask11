package com.company;

public abstract class Animal {
    private String name;

    public int abstractgreed() {
        return 0;
    }

    public Animal(String name) {
        this.name=name;

    }


    public String getName() {
        return name;
    }
}
class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }
public int greets(){
    System.out.println("Dog says: Woof");
    return 0;
}
public void greetsanotherDog() {
    System.out.println("Woooof");
    }
    public int feed(){
        System.out.println("Feeding dog");
    return 0; }
    public int walk(){
        System.out.println("Walking dog");
    return 0; }
    public int play(){
        System.out.println("Playing with dog"+getName());
        return 0;
    }

}
interface Pet{
    public int feed();
    public int walk();
    public int play();

}
class Cat extends Animal implements Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public int feed() {
        System.out.println("Feeding cat" + getName());
        return 0;
    }

    @Override
    public int walk() {
        System.out.println("Walking cat" + getName());
        return 0;
    }

    @Override
    public int play() {
        System.out.println("Playing with cat" + getName());
        return 0;
    }
}
class BigDog extends Dog implements Pet{


    public BigDog(String name) {
        super(name);
    }

    @Override
    public int feed() {
        return 0;
    }

    @Override
    public int walk() {
        return 0;
    }

    @Override
    public int play() {
        return 0;
    }
    public int greets(){
        System.out.println("Woow");
        return 0;
    }
    public int greetsAnotherDog(){
        System.out.println("Wooooow");
        return 0;
    }
    public int greetsAnotherBigDog(){
        System.out.println("Wooo00000oow");
        return 0;
    }
}
interface WildAnimal{
    public int hunting();
}








