package com.oshacker.design.principle.compositereuse;

public class Test {
    public static void main(String[] args) {
        ProductDAO productDAO=new ProductDAO();
        productDAO.setDbConnection(new MysqlConnection());
        productDAO.addProduct();
        productDAO.setDbConnection(new OracleConnection());
        productDAO.addProduct();
    }
}
