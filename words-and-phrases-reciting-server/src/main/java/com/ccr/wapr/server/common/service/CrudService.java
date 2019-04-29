package com.ccr.wapr.server.common.service;

import java.util.List;
import java.util.Optional;

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
    <S extends T> S save(S entity);

    /**
     * 批量新增
     * @param entities 实体
     * @return 保存后的实体
     */
    <S extends T> List<S> saveAll(Iterable<S> entities);

    /**
     * findById
     * @param id id
     * @return 返回找到的实体，不存在则返回 null
     */
    Optional<T> findById(ID id);

    /**
     * 检测是否存在该Id的实体
     * @param id id
     * @return 是否存在
     */
    boolean existsById(ID id);

    /**
     * 检索所有的实体
     * @return 所有实体
     */
    List<T> findAll();

    /**
     * 根据Id集合检索
     * @param ids id集合
     * @return 满足条件的所有实体
     */
    List<T> findAllById(Iterable<ID> ids);

    /**
     * 统计实体个数
     * @return 实体个数
     */
    long count();

    /**
     * 删除实体
     * @param entity 实体
     */
    void delete(T entity);

    /**
     * 删除满足条件的所有实体
     * @param entities 实体条件
     */
    void deleteAll(Iterable<? extends T> entities);

    /**
     * 删除所有实体
     */
    void deleteAll();
}
