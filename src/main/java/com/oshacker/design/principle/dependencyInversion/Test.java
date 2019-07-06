package com.oshacker.design.principle.dependencyInversion;

public class Test {
    public static void main(String[] args) {
        //Geely: 未遵守依赖倒置原则
        Geely geely=new Geely();
        geely.studyFECourse();
        geely.studyJavaCourse();
        geely.studyPythonCourse(); //新需求

        //Oshacker: 遵守依赖倒置原则，用接口方法的方式来注入具体的实现
        Oshacker oshacker=new Oshacker();
        oshacker.studyImoocCourse(new FECourse());
        oshacker.studyImoocCourse(new JavaCourse());
        oshacker.studyImoocCourse(new PythonCourse()); //新需求

        //Oshacker01: 遵守依赖倒置原则，用构造器的方式来注入具体的实现
        Oshacker01 oshacker01=new Oshacker01(new FECourse());
        oshacker01.studyImoocCourse();
        oshacker01=new Oshacker01(new JavaCourse());
        oshacker01.studyImoocCourse();
        oshacker01=new Oshacker01(new PythonCourse());
        oshacker01.studyImoocCourse();

        //Oshacker02: 遵守依赖倒置原则，用setter的方式来注入具体的实现
        Oshacker02 oshacker02=new Oshacker02();
        oshacker02.setiCourse(new FECourse());
        oshacker02.studyImoocCourse();
        oshacker02.setiCourse(new JavaCourse());
        oshacker02.studyImoocCourse();
        oshacker02.setiCourse(new PythonCourse());
        oshacker02.studyImoocCourse();
    }
}
