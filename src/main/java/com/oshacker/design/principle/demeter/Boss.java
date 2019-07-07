package com.oshacker.design.principle.demeter;

public class Boss {
    //违反迪米特法则
//    public void commandCheckNumber(TeamLeader teamLeader) {
//        List<Course> courseList=new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
//        teamLeader.checkNumber(courseList);
//    }

    //遵守迪米特法则
    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumber();
    }
}
