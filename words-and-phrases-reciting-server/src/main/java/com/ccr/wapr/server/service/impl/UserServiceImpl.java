package com.ccr.wapr.server.service.impl;

import com.ccr.wapr.server.model.UserDO;
import com.ccr.wapr.server.repository.UserRepository;
import com.ccr.wapr.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ccr12312@163.com at 2019-4-25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDO saveUser(UserDO user) {
        return userRepository.save(user);
    }
}
