package com.ccr.wapr.server.common.service.impl;

import com.ccr.wapr.server.user.model.UserDO;
import com.ccr.wapr.server.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

        System.out.println("保存结果：" + userService.save(userDO).toString());
        System.out.println("用户数量：" + userService.count());
        System.out.println("所有用户：" + userService.findAll());

    }
}