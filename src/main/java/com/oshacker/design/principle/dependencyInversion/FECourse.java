package com.oshacker.design.principle.dependencyInversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("oshacker正在学习FE课程");
    }
}
