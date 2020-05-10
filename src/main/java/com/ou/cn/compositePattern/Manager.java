package com.ou.cn.compositePattern;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * description: Manager composite节点 ：管理层员工<br>
 * date: 2020/5/10 15:50 <br>
 * author: 夏林梦子 <br>
 */
public class Manager implements DepartmentEmployee {

    LinkedList<DepartmentEmployee> list;

    String name;

    Double salary;

    public Manager(String name, Double salary) {
        this.list = new LinkedList<>();
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(DepartmentEmployee employee) {
        list.add(employee);
    }

    @Override
    public void remove(DepartmentEmployee employee) {
        list.remove(employee);
    }

    @Override
    public DepartmentEmployee getChild(int index) {
        return list.get(index);
    }

    @Override
    public Iterator<DepartmentEmployee> getAllChildren() {
        return list.iterator();
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
