package org.asocframework.spi.model.dal.base;

import java.util.List;

/**
 * @author jiqing
 * @version $Id: ParameterDefine，v 1.0 2017/10/27 09:57 jiqing Exp $
 * @desc
 */
public class ParameterDefine <T extends ParameterDefine<?>>{

    /**
     * 上层id
     */
    private String pid;

    /**
     * id
     */
    private String id;

    /**
     * 层级
     */
    private Integer level = 0;

    /**
     *
     */
    private String name;
    /**
     *
     */
    private String desc;
    /**
     * 参数类名称
     */
    private String className;
    /**
     *参数类型，基础类型，数组，Map ，Collection，自定义Class
     */
    private Integer parameterType;
    /**
     *排序下标
     */
    private Integer orderIndex;
    /**
     * 子参数列表
     */
    private List<T> childs;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getParameterType() {
        return parameterType;
    }

    public void setParameterType(Integer parameterType) {
        this.parameterType = parameterType;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public List<T> getChilds() {
        return childs;
    }

    public void setChilds(List<T> childs) {
        this.childs = childs;
    }

}
