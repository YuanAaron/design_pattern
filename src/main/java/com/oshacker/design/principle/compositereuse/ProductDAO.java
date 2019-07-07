package com.oshacker.design.principle.compositereuse;

public class ProductDAO extends DBConnection {
    public void addProduct() {
        String conn = super.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
