package com.coder.dream.base.controller;

import com.coder.dream.base.dao.BaseDao;
import com.coder.dream.base.dao.mapper.BaseMapper;
import com.coder.dream.base.dao.query.support.FilterQuery;
import com.coder.dream.base.model.BaseEntity;
import com.coder.dream.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

public abstract class BaseController<T extends BaseEntity,M extends BaseMapper<T>,D extends BaseDao<T,M>,S extends BaseService<T,M,D>>{

    @Autowired
    private S service;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<T> list(@RequestParam Map<String,String> params){
        FilterQuery filters = new FilterQuery();
        return service.list(filters);
    }
}
