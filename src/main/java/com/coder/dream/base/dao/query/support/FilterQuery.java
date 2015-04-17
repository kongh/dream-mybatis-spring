package com.coder.dream.base.dao.query.support;

import com.coder.dream.base.dao.query.DynamicQuery;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
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
     * 等于
     *
     * @param column
     * @param value
     */
    public void eq(String column,Object value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_EQUAL);
        filters.put(param,value);
    }

    /**
     * 不等
     *
     * @param column
     * @param value
     */
    public void ne(String column,Object value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_NOT_EQUAL);
        filters.put(param,value);
    }

    /**
     * 大于
     *
     * @param column
     * @param value
     */
    public void gt(String column,Integer value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_GREATER);
        filters.put(param,value);
    }

    /**
     * 大于
     *
     * @param column
     * @param value
     */
    public void gt(String column,Date value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_GREATER);
        filters.put(param,value);
    }

    /**
     * 大于等于
     *
     * @param column
     * @param value
     */
    public void ge(String column,Integer value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_GREATER_EQUAL);
        filters.put(param,value);
    }

    /**
     * 大于等于
     *
     * @param column
     * @param value
     */
    public void ge(String column,Date value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_GREATER_EQUAL);
        filters.put(param,value);
    }

    /**
     * 小于
     *
     * @param column
     * @param value
     */
    public void lt(String column,Integer value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_LESS);
        filters.put(param,value);
    }

    /**
     * 小于
     *
     * @param column
     * @param value
     */
    public void lt(String column,Date value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_LESS);
        filters.put(param,value);
    }

    /**
     * 小于等于
     *
     * @param column
     * @param value
     */
    public void le(String column,Integer value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_LESS_EQUAL);
        filters.put(param,value);
    }

    /**
     * 小于等于
     *
     * @param column
     * @param value
     */
    public void le(String column,Date value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_LESS_EQUAL);
        filters.put(param,value);
    }

    /**
     * like
     *
     * @param column
     * @param value
     */
    public void like(String column,String value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_LIKE);
        filters.put(param,value);
    }

    /**
     * not like
     *
     * @param column
     * @param value
     */
    public void notLike(String column,String value){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_NOT_LIKE);
        filters.put(param,value);
    }

    /**
     * in
     *
     * @param column
     * @param values
     */
    public void in(String column,List<String> values){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_IN);
        filters.put(param,values);
    }

    /**
     * in
     *
     * @param column
     * @param values
     */
    public void in(String column,String[] values){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_IN);
        filters.put(param,values);
    }

    /**
     * not in
     *
     * @param column
     * @param values
     */
    public void notIn(String column,List<String> values){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_NOT_IN);
        filters.put(param,values);
    }

    /**
     * or
     *
     * @param subFilters
     */
    public void or(FilterQuery subFilters){
        DynamicParam param = new DynamicParam(LOGIC_OR,LOGIC_OR_PLACEHOLDER + filters.size(),LOGIC_OR_PLACEHOLDER + filters.size());
        filters.put(param,subFilters.getFilters());
    }

    /**
     * 为空
     *
     * @param column
     */
    public void isNull(String column){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_IS);
        filters.put(param,null);
    }

    public void isNotNull(String column){
        DynamicParam param = new DynamicParam(LOGIC_AND,column,OPERATOR_IS_NOT);
        filters.put(param,null);
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
