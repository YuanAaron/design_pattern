package com.oshacker.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

    //这里将Map改为HashMap也可以，即里式替换原则：子类的返回值比父类的返回值更严格或相等
    @Override
    public HashMap method() {
        HashMap hashMap=new HashMap();
        hashMap.put("message","子类的method方法被执行");
        return hashMap;
    }
}
