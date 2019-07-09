package com.oshacker.design.structural.adapter.classadapter;

//通过Adapter将Adaptee适配给了Target接口
//类适配器通过继承被适配这实现
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        //增加代码1
        super.adapteeRequest();
        //增加代码2
    }
}
