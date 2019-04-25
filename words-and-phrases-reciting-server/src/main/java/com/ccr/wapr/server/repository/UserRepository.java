package com.ccr.wapr.server.repository;

import com.ccr.wapr.server.model.UserDO;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 通过此接口访问userDO集合
 * @author ccr12312@163.com at 2019-4-25
 */
public interface UserRepository extends MongoRepository<UserDO, String> {
}
