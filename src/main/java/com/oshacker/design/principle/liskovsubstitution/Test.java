package com.oshacker.design.principle.liskovsubstitution;

public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth()<=rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth()+" longth:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth()+" longth:"+rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);

        Square square=new Square();
//        square.setLength(10);
//        resize(square); //报错
    }

    //在基类Quadrange类中没有赋值方法，因此类似于Test的resize（）方法不可能适用于Quadrangle类型，
    //而只能适用于具体子类Rectangle和Square，因此里氏替换原则不可能被破坏了。
}
