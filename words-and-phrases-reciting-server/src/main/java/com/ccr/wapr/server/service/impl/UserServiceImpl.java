package com.ccr.wapr.server.service.impl;

import com.ccr.wapr.server.model.UserDO;
import com.ccr.wapr.server.repository.UserRepository;
import com.ccr.wapr.server.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ccr12312@163.com at 2019-4-25
 */
@Service
public class UserServiceImpl extends AbstractCrudService<UserDO,String> implements UserService, InitializingBean {

    @Autowired
    UserRepository userRepository;


    @Override
    public void afterPropertiesSet() throws Exception {
        super.setRepository(userRepository);
    }

    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }
}
