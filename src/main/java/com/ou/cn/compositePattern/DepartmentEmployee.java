package com.ou.cn.compositePattern;

import java.util.Iterator;

/**
 * description: Department 抽象组件：部门 <br>
 * date: 2020/5/10 15:39 <br>
 * author: 夏林梦子 <br>
 */
public interface DepartmentEmployee {

    /**
     * description: add 添加员工
     * @param employee 员工
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 15:46
     */
    void add(DepartmentEmployee employee);

    /**
     * description: remove 移除员工
     * @param employee 员工
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 15:46
     */
    void remove(DepartmentEmployee employee);

    /**
     * description: getChild 获取子节点
     * @param index 节点层次
     * return com.ou.cn.compositePattern.DepartmentEmployee
     * author: 夏林梦子
     * date: 2020/5/10 15:46
     */
    DepartmentEmployee getChild(int index);

    /**
     * description: getAllChildren 获取所有孩子
     * return java.util.Iterator<com.ou.cn.compositePattern.DepartmentEmployee>
     * author: 夏林梦子
     * date: 2020/5/10 15:46
     */
    Iterator<DepartmentEmployee> getAllChildren();

    /**
     * description: isLeaf 判断是否是叶子
     * return boolean
     * author: 夏林梦子
     * date: 2020/5/10 15:47
     */
    boolean isLeaf();

    /**
     * description: getSalary 获取薪资
     * return java.lang.Double
     * author: 夏林梦子
     * date: 2020/5/10 15:47
     */
    Double getSalary();

    /**
     * description: setSalary 设置薪资
     * @param salary 薪资
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 15:47
     */
    void setSalary(Double salary);

    
}
