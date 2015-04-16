package com.coder.dream.base.dao.query.support;

import com.coder.dream.base.dao.query.DynamicQuery;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 过滤列表
 *
 * <p>
 *     动态条件查询
 * </p>
 */
public class FilterQuery implements DynamicQuery {

    private Map filters = new LinkedHashMap<DynamicParam,Object>();

    private String table;

    public FilterQuery(){

    }

    public FilterQuery(String table){
        this.table = table;
    }

    /**
     * 相等
     *
     * @param column
     * @param value
     */
    public void eq(String column,Integer value){
        DynamicParam param = new DynamicParam("and",column,"=");
        filters.put(param,value);
    }

    /**
     * 相等
     *
     * @param column
     * @param value
     */
    public void eq(String column,String value){
        DynamicParam param = new DynamicParam("and",column,"=");
        filters.put(param,value);
    }


    public Map getFilters() {
        return filters;
    }

    public void clear() {
        filters.clear();
    }

    public String getTable() {
        return table;
    }
}
