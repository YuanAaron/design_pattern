package com.oshacker.design.structural.adapter.objectadapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget的方法");
    }
}
