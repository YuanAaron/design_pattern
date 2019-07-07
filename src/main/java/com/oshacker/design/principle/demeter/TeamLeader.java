package com.oshacker.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
//    public void checkNumber(List<Course> courseList) {
//        System.out.println("在线课程的总量为："+courseList.size());
//    }

    public void checkNumber() {
        List<Course> courseList=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的总量为："+courseList.size());
    }
}
