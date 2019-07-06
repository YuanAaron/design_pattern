package com.oshacker.design.principle.dependencyInversion;

public class Geely {
    public void studyFECourse() {
        System.out.println("geely正在学习FE课程");
    }

    public void studyJavaCourse() {
        System.out.println("geely正在学习Java课程");
    }

    //新需求
    public void studyPythonCourse() {
        System.out.println("geely正在学习Python课程");
    }
}
