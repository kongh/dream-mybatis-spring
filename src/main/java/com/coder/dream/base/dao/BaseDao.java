package com.coder.dream.base.dao;

import com.coder.dream.base.dao.mapper.BaseMapper;
import com.coder.dream.base.dao.query.support.FilterQuery;
import com.coder.dream.base.mode.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseDao<T extends BaseEntity,M extends BaseMapper<T>> {

    @Autowired
    protected M mapper;

    /**
     * 列表
     *
     * @param filters
     * @return
     */
    public List<T> list(FilterQuery filters){
        return mapper.list(filters);
    }

    /**
     * 分页
     *
     * @param filters
     * @return
     */
    public List<T> page(FilterQuery filters,int start,int limit){
        return mapper.page(filters);
    }
}
