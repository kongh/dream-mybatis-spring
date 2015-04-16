package com.coder.dream.base.dao.query.support;

/**
 * 动态参数
 *
 */
public class DynamicParam {

    /**
     * 运算符
     */
    private String calculation;

    /**
     * 操作符
     */
    private String operator;

    /**
     * 列名
     */
    private String column;

    /**
     * 构造器
     *
     */
    public DynamicParam(){

    }

    /**
     * 构造器
     *
     * @param calculation
     * @param column
     * @param operator
     *
     */
    public DynamicParam(String calculation, String column, String operator) {
        this.calculation = calculation;
        this.operator = operator;
        this.column = column;
    }

    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return calculation + "_" + column + "_" + operator;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }

        if(!(obj instanceof DynamicParam)){
            return false;
        }

        DynamicParam compare = (DynamicParam)obj;
        return calculation == compare.getCalculation()
                && column == compare.getColumn() &&
                operator == compare.getOperator();
    }

    @Override
    public int hashCode() {
        return calculation.hashCode() ^ column.hashCode() ^ operator.hashCode();
    }
}
