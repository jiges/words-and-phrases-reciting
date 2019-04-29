package com.ccr.wapr.server.user.service;

import com.ccr.wapr.server.common.service.CrudService;
import com.ccr.wapr.server.user.model.UserDO;

/**
 * @author ccr12312@163.com at 2019-4-25
 */
public interface UserService extends CrudService<UserDO,String> {

    /**
     * 根据Id删除
     * @param id id
     */
    void deleteById(String id);

}
