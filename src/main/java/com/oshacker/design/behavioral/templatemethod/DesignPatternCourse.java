package com.oshacker.design.principle.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程java源码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
