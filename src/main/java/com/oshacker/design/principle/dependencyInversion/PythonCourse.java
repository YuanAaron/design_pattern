package com.oshacker.design.principle.dependencyInversion;

//新需求
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("oshacker正在学习Python课程");
    }
}
