package com.oshacker.design.principle.compositereuse;

public class ProductDAO {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection=dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
