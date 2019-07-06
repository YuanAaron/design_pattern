package com.oshacker.design.principle.dependencyInversion;

public class Oshacker01 {
    private ICourse iCourse;

    public Oshacker01(ICourse iCourse) {
        this.iCourse=iCourse;
    }

    public void studyImoocCourse() {
        this.iCourse.studyCourse();
    }
}
