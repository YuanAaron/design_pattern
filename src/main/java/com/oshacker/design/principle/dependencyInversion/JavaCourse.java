package com.oshacker.design.principle.dependencyInversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("oshacker正在学习Java课程");
    }
}
