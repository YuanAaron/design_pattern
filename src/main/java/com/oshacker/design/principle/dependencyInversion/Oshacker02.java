package com.oshacker.design.principle.dependencyInversion;

public class Oshacker02 {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse=iCourse;
    }

    public void studyImoocCourse() {
        this.iCourse.studyCourse();
    }
}
