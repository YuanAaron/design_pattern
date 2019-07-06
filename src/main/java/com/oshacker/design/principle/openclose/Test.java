package com.oshacker.design.principle.openclose;

// 关于Java强制类型转换，请参考：https://www.cnblogs.com/chenssy/p/3393160.html
// 关于double丢失精度的问题，使用BigDecimal的String构造器解决，详细自己google解决
public class Test {
    public static void main(String[] args) {
        ICourse iCourse=new JavaDiscountCourse(96,"Java从零到企业级电商开发",348d); //向上转型
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse; //向下转型
        System.out.println("课程ID:"+javaCourse.getId()+" 课程名称:"+javaCourse.getName()+" 课程原价:"+javaCourse.getOriginPrice()+" 课程折后价格:"+javaCourse.getPrice()+"元");
    }
}
