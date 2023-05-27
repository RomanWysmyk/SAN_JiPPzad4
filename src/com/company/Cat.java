package com.company;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
        public void makeSound() {
            System.out.println(name+" miauczy");
        }
        public void milkDrinking() {
            System.out.println("Cat drinks milk");
        }

}
