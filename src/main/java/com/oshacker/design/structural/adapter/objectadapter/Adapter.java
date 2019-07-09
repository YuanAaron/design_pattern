package com.oshacker.design.structural.adapter.objectadapter;

public class Adapter implements Target {
    private Adaptee adaptee=new Adaptee();

    @Override
    public void request() {
        //增加代码1
        //委托给adaptee来实现
        adaptee.adapteeRequest();
        //增加代码2
    }
}
