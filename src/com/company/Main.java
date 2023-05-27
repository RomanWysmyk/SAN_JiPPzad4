package com.company;

public class Main {

    static void test1(Animal... animals) {
        for(Animal a : animals) {
            a.makeSound();
        }
    }

    public static void main(String[] args) {
        test1(new Dog("Pluto"), new Cat("Mruczek"));
    }

}
