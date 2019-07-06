package com.oshacker.design.principle.singleresponsibility;

public class CourseImpl implements ICourseInformation,ICourseManagement {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVedio() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
