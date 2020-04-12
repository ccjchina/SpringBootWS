package com.jack.webapi.common;

import java.sql.*;

public class CustomConnenction {

    Connection c = null;
    Statement statmt = null;
    ResultSet rs = null;

    public CustomConnenction() {
        try {
            String dbUrl = "jdbc:sqlserver://10.160.144.110:1433;DatabaseName=Ecology";
            //pro.getPropValue("weaver", "ecology.url");
            String user = "sa";
            //pro.getPropValue("weaver", "ecology.user");
            String password = "abc-123";
            //pro.getPropValue("weaver", "ecology.password");
            String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            //pro.getPropValue("weaver", "DriverClasses");
            Class.forName(driverClass).newInstance();
            c = DriverManager.getConnection(dbUrl, user, password);
            c.setAutoCommit(true);
            statmt = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String sql) {
        rs = null;
        try {
            rs = statmt.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean executeUpdate(String sql) {
        try {
            statmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void executeSql(String sql) {
        try {
            rs = statmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void execute(String sql) {
        executeSql(sql);
    }

    public boolean next() {
        try {
            return rs.next();
        } catch (Exception e) {
            return false;
        }
    }

    public String getString(String column) {
        try {
            return rs.getString(column);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getString(int column) {
        try {
            return rs.getString(column);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Date getDate(String column) {
        try {
            return rs.getDate(column);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Date getDate(int column) {
        try {
            return rs.getDate(column);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getInt(String column) {
        try {
            return rs.getInt(column);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getInt(int column) {
        try {
            return rs.getInt(column);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public double getDouble(int column) {
        try {
            return rs.getDouble(column);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public double getDouble(String column) {
        try {
            return rs.getDouble(column);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public void beforeFirst() {
        try {
            rs.beforeFirst();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getCounts() {
        try {
            rs.last();
            return rs.getRow();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public PreparedStatement getPreparedStatement(String sql) {
        PreparedStatement preparedStatement = null;
        try {
            if (null != c) {
                preparedStatement = c.prepareStatement(sql);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return preparedStatement;
    }

    public void close() {
        try {
            System.out.println("=== Realse Record SET ====");
            if (null != rs) {
                rs.close();
            }
            if (null != statmt) {
                statmt.close();
            }
            if (null != c) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}