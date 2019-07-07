package com.oshacker.design.principle.compositereuse;

public class OracleConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "Oracle的数据库连接";
    }
}
