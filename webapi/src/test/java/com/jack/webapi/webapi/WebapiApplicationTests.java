package com.jack.webapi.webapi;

import com.jack.webapi.model.PersonInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebapiApplicationTests {

    @Autowired
    PersonInfo info;

    @Test
    public void contextLoads() {
        System.out.print(info);
    }

}
