package com.jack.webapi.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConn {

    Connection c = null;
    Statement statmt = null;
    ResultSet rs = null;

    public MySqlConn() {
        try {
            String dbUrl = "jdbc:mysql://localhost:3306/suga?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8";
            String user = "root";
            String password = "123456";
            String driverClass = "com.mysql.cj.jdbc.Driver";
            //"com.mysql.jdbc.Driver";
            Class.forName(driverClass).newInstance();
            c = DriverManager.getConnection(dbUrl, user, password);
            //c.setAutoCommit(true);
            statmt = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConntion() {
        return c;
    }
    public Statement getStatmt() {
        return statmt;
    }
}
