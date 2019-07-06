package com.oshacker.design.principle.interfacesegregation;

public class Bird implements IAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() { //不一定会飞

    }

    @Override
    public void swim() { //不一定会游泳

    }
}
