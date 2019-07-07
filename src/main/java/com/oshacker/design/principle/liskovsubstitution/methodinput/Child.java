package com.oshacker.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

//    @Override//重写
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行...");
//    }

    //重载父类方法
    public void method(Map map) {
        System.out.println("子类Map入参方法被执行...");
    }
}
