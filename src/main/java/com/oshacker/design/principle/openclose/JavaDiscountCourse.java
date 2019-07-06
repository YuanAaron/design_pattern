package com.oshacker.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        //满200打9折，满300打8折
        return super.getPrice()*0.8;//打八折
    }
}
