package com.oshacker.design.principle.singleresponsibility;

//接口层次
public interface ICourse {
    //职责1：获得课程信息
    String getCourseName();
    byte[] getCourseVedio();

    //职责2：管理课程
    void studyCourse();
    void refundCourse();//退课，退课后无法获取课程信息
}
