package com.ccr.wapr.server.service.impl;

import com.ccr.wapr.server.model.UserDO;
import com.ccr.wapr.server.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author ccr12312@163.com at 2019-4-25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void saveUser() {
        UserDO userDO = UserDO.builder()
                .userName("Cherokee")
                .wxId("LoisDUIFdsDSDGFGX-DHJNe")
                .build();

        System.out.println(userService.saveUser(userDO).toString());

    }
}