package com.ou.cn.compositePattern;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * description: Employee Leaf节点：普通员工<br>
 * date: 2020/5/10 15:50 <br>
 * author: 夏林梦子 <br>
 */
public class Employee implements DepartmentEmployee{

    String name;

    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(DepartmentEmployee employee) {

    }

    @Override
    public void remove(DepartmentEmployee employee) {

    }

    @Override
    public DepartmentEmployee getChild(int index) {
        return null;
    }

    @Override
    public Iterator<DepartmentEmployee> getAllChildren() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return true;
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
