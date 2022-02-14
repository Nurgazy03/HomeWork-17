package com.company;

public class Turtle extends Animal{
    public void swim() {
        System.out.println("Turtle walk slowly");
    }

    @Override
    public void running() {
        swim();
    }

}
