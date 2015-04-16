package com.coder.dream.base.dao.mapper;

import com.coder.dream.base.dao.query.Query;

import java.util.List;

public interface BaseMapper<T> {

    /**
     * ��ѯ�б�
     *
     * @param query
     * @return
     */
    public List<T> list(Query query);

    /**
     * ��ѯ��ҳ
     *
     * @param query
     * @return
     */
    public List<T> page(Query query);

    /**
     * ����һ��
     *
     * @param id
     * @return
     */
    public T fineOne(Integer id);


    /**
     * ����
     *
     * @param t
     */
    public void insert(T t);

    /**
     * ����
     *
     * @param t
     */
    public void update(T t);

    /**
     * ɾ��һ��
     *
     * @param id
     */
    public void deleteOne(String id);

    /**
     * ����ɾ��
     *
     * @param ids
     */
    public void deleteBatch(List<String> ids);
}
