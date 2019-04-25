package com.ccr.wapr.server.service;

import com.ccr.wapr.server.model.UserDO;

/**
 * @author ccr12312@163.com at 2019-4-25
 */
public interface UserService {

    /**
     * 保存用户
     * @param user //用户
     * @return UserDO
     */
    UserDO saveUser(UserDO user);

}
