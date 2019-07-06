package com.oshacker.design.principle.singleresponsibility;

//方法层次
public class Method {
    //方法层次：不满足单一变量原则
    public void updateUserInfo(String userName,String address) {

    }

    public void updateUserInfo(String userName,String... properties) {

    }

    //方法层次：满足单一变量原则
    public void updateUsername(String userName) {

    }

    public void updateUserAddress(String userAddress) {

    }
}
