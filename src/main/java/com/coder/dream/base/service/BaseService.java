package com.coder.dream.base.service;

import com.coder.dream.base.dao.BaseDao;
import com.coder.dream.base.dao.mapper.BaseMapper;
import com.coder.dream.base.web.vo.FilterMap;
import com.coder.dream.base.web.vo.OrderMap;
import com.coder.dream.base.dao.model.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T extends BaseEntity,M extends BaseMapper<T>,D extends BaseDao<T,M>> {

    @Autowired
    protected D dao;

    /**
     * 列表
     *
     * @param filterMap
     * @param orderMap
     * @return
     */
    public List<T> list(FilterMap filterMap,OrderMap orderMap){
        return dao.list(filterMap,orderMap);
    }

    /**
     * 分页
     *
     * @param filterMap
     * @param orderMap
     * @param start
     * @param limit
     * @return
     */
    public List<T> page(FilterMap filterMap,OrderMap orderMap,Integer start,Integer limit){
        return dao.page(filterMap,orderMap,start,limit);
    }
}
