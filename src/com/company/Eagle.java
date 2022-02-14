package com.company;

public class Eagle extends Animal{

    public void fly() {
        System.out.println("Eagle love flay and its mean freedom");
    }

    @Override
    public void running() {
        fly();
    }
}

