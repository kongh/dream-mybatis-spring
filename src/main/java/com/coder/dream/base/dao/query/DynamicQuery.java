package com.coder.dream.base.dao.query;

import java.util.Map;

/**
 * 动态查询接口
 *
 */
public interface DynamicQuery extends Query{
    /**
     * 逻辑运算符（and）
     */
    public final static String LOGIC_AND = "and";

    /**
     * 逻辑运算符（or）
     */
    public final static String LOGIC_OR = "or";

    /**
     * 逻辑运算符（or）占位符
     */
    public final static String LOGIC_OR_PLACEHOLDER ="LOGIC_OR_PLACEHOLDER";

    /**
     * 操作符（=）
     */
    public final static String OPERATOR_EQUAL = "=";

    /**
     * 操作符（！=）
     */
    public final static String OPERATOR_NOT_EQUAL = "!=";

    /**
     * 操作符（like）
     */
    public final static String OPERATOR_LIKE = "like";

    /**
     * 操作符（not like）
     */
    public final static String OPERATOR_NOT_LIKE = "not like";

    /**
     * 操作符（in）
     */
    public final static String OPERATOR_IN = "in";

    /**
     * 操作符（not in）
     */
    public final static String OPERATOR_NOT_IN = "not in";

    /**
     * 操作符（大于）
     */
    public final static String OPERATOR_GREATER = ">";

    /**
     * 操作符（大于等于）
     */
    public final static String OPERATOR_GREATER_EQUAL = ">=";

    /**
     * 操作符（小于）
     */
    public final static String OPERATOR_LESS = "<";

    /**
     * 操作符（小于等于）
     */
    public final static String OPERATOR_LESS_EQUAL = "<=";

    /**
     * 操作符（is）
     */
    public final static String OPERATOR_IS = "is";

    /**
     * 操作符（is not null）
     */
    public final static String OPERATOR_IS_NOT = "is not";

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
