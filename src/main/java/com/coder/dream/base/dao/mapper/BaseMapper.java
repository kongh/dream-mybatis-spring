package com.coder.dream.base.dao.mapper;

import com.coder.dream.base.dao.query.Query;

import java.util.List;

public interface BaseMapper<T> {

    /**
     * 列表
     *
     * @param query
     * @return
     */
    public List<T> list(Query query);

    /**
     * 分页
     *
     * @param query
     * @return
     */
    public List<T> page(Query query);

    /**
     * 查找一个
     *
     * @param id
     * @return
     */
    public T fineOne(Integer id);


    /**
     * 插入
     *
     * @param t
     */
    public void insert(T t);

    /**
     * 更新
     *
     * @param t
     */
    public void update(T t);

    /**
     * 删除一个
     *
     * @param id
     */
    public void deleteOne(String id);

    /**
     * 批量删除
     *
     * @param ids
     */
    public void deleteBatch(List<String> ids);
}
