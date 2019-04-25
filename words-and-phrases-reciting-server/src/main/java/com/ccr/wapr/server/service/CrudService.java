package com.ccr.wapr.server.service;

/**
 * 提供通用的增删改查方法
 * @author ccr12312@163.com at 2019-4-25
 */
public interface CrudService<T,ID> {

    /**
     * 保存实体
     * @param entity 实体
     * @return 实体
     */
    T save(T entity);

    /**
     * Id 检索
     * @param id id
     * @return T
     */
    T findById(ID id);
}
