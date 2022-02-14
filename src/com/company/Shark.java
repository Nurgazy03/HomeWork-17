package com.company;

public class Shark extends Animal{
    public void attack() {
        System.out.println("The Shark attacks suddenly to catch pray");
    }
    @Override
    public void running() {
        attack();
    }
}
