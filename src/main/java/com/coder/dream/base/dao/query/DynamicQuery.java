package com.coder.dream.base.dao.query;

import java.util.Map;

/**
 * 动态查询接口
 *
 */
public interface DynamicQuery extends Query{
    /**
     * 表名
     *
     * @return
     */
    public String getTable();

    /**
     * 过滤条件参数列表
     *
     * @return
     */
    public Map getFilters();

    /**
     * 清空
     */
    public void clear();
}
