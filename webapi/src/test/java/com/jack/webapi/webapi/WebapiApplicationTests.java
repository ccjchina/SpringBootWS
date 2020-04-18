package com.jack.webapi.webapi;


import com.jack.webapi.common.MySqlConn;
import com.jack.webapi.model.PersonInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.apache.commons.httpclient.HttpStatus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebapiApplicationTests {

    @Autowired
    PersonInfo info;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(info);
        System.out.println(HttpStatus.SC_OK);
        MySqlConn conn1 = new MySqlConn();
        MySqlConn conn2 = new MySqlConn();
        Connection con1 = conn1.getConntion();
        Connection con2 = conn2.getConntion();

        String sqlcmd = "update mydata set data1 ='cccc' where id=4";
        String sqlcmd1 = "select * from mydata  where id=4";

        Statement stm1 = conn1.getStatmt();
        //con1.setAutoCommit(false);
        Statement stm2 = conn2.getStatmt();

        for (int i = 0; i <= 100; i++) {
            stm1.executeUpdate(sqlcmd);
            System.out.print(i);
            ResultSet rs = stm2.executeQuery(sqlcmd1);
            if (rs.next()) {
                rs.getString("data1");
            }
        }
        System.out.print("==============================");
    }

    @Test
    public void singletonTest() {

    }
}