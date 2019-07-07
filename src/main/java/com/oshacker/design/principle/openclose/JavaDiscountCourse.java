package com.oshacker.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    //将打折活动放到子类特有的方法中
    public Double getDiscountPrice() {
        return super.getPrice()*0.8;
    }

    // 违反里式替换原则的引申意：子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
//    @Override
//    public Double getPrice() {
//        //满200打9折，满300打8折
//        return super.getPrice()*0.8;//打八折
//    }
}
