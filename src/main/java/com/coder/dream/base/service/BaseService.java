package com.coder.dream.base.service;

import com.coder.dream.base.dao.BaseDao;
import com.coder.dream.base.dao.mapper.BaseMapper;
import com.coder.dream.base.dao.query.support.FilterQuery;
import com.coder.dream.base.model.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T extends BaseEntity,M extends BaseMapper<T>,D extends BaseDao<T,M>> {

    @Autowired
    protected D dao;

    public List<T> list(FilterQuery filters){
        return dao.list(filters);
    }
}
