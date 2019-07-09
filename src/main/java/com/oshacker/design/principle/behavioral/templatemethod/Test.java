package com.oshacker.design.principle.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start...");
        ACourse designPatternCourse=new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end...");

        System.out.println("前端课程start...");
        //某门前端课程既可以编写手记，也可以不编写手记
        ACourse feCourse=new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end...");
    }
}
