package com.coder.dream.base.dao;

import com.coder.dream.base.dao.mapper.BaseMapper;
import com.coder.dream.base.dao.query.support.DefaultDynamicQuery;
import com.coder.dream.base.web.vo.FilterMap;
import com.coder.dream.base.web.vo.OrderMap;
import com.coder.dream.base.dao.model.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseDao<T extends BaseEntity,M extends BaseMapper<T>> {

    @Autowired
    protected M mapper;

    /**
     * 列表
     *
     * @param filterMap
     * @param orderMap
     * @return
     */
    public List<T> list(FilterMap filterMap,OrderMap orderMap){
        DefaultDynamicQuery query = new DefaultDynamicQuery(filterMap,orderMap);
        return mapper.list(query);
    }


    /**
     * 分页
     *
     * @param filterMap
     * @param orderMap
     * @param pageIndex
     * @param pageLimit
     * @return
     */
    public List<T> page(FilterMap filterMap,OrderMap orderMap,int pageIndex,int pageLimit){
        DefaultDynamicQuery query = new DefaultDynamicQuery(filterMap,orderMap,pageIndex,pageLimit);
        return mapper.list(query);
    }
}
