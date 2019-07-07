package com.oshacker.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Base child=new Child();
        HashMap hashMap=new HashMap();
        child.method(hashMap);
    }
    //里式替换原则：子类重载父类方法时，入参要比父类的更宽松。
    //重写父类方法且重载该方法时，调用子类中重写的方法
    //不重写父类方法，重载父类方法时，调用父类中的方法，重载方法永远不会被执行
}
