package com.oshacker.design.principle.compositereuse;

public class MysqlConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL的数据库连接";
    }
}
