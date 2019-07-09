package com.oshacker.design.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        //Target的一种具体实现
        Target target=new ConcreteTarget();
        target.request();

        //Target的另一种具体实现通过Adapter移交给了Adaptee
        Target adapterTarget=new Adapter();
        adapterTarget.request();
    }
}
