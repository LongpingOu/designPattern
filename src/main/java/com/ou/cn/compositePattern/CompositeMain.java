package com.ou.cn.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * description: CompositeMain <br>
 * date: 2020/5/10 16:04 <br>
 * author: 夏林梦子 <br>
 */
public class CompositeMain {

    public static void main(String[] args) {
        // 创建部门经理层级员工
        DepartmentEmployee departmentLeader = new Manager("部门经理",30000d);

        // 创建组层级员工
        DepartmentEmployee groupLeader1 = new Manager("组长1",22000d);
        DepartmentEmployee groupLeader2 = new Manager("组长2",22000d);

        // 创建项目经理层级员工
        DepartmentEmployee projectManager1 = new Manager("项目经理1",17000d);
        DepartmentEmployee projectManager2 = new Manager("项目经理2",17000d);
        DepartmentEmployee projectManager3 = new Manager("项目经理3",17000d);
        DepartmentEmployee projectManager4 = new Manager("项目经理4",17000d);

        // 创建普通层级员工
        List<DepartmentEmployee> employeeList = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            DepartmentEmployee employee = new Manager("普通员工",15000d);
            employeeList.add(employee);
        }

        // 部门经理下辖两个组
        departmentLeader.add(groupLeader1);
        departmentLeader.add(groupLeader2);

        // 每个组下辖两个项目
        groupLeader1.add(projectManager1);
        groupLeader1.add(projectManager2);

        groupLeader2.add(projectManager3);
        groupLeader2.add(projectManager4);

        // 每个项目组下辖5位普通员工
        for (int i = 0; i < employeeList.size(); i++) {
            DepartmentEmployee employee = employeeList.get(i);
            if (i<5) {
                projectManager1.add(employee);
            }
            if (i<10) {
                projectManager2.add(employee);
            }
            if (i<15) {
                projectManager3.add(employee);
            }
            if (i<20) {
                projectManager4.add(employee);
            }
        }

        // 计算出个层级的薪资
        System.out.println("一个项目工资：" + CalculateSalary.calculateSalary(projectManager1));
        System.out.println("一个组工资：" + CalculateSalary.calculateSalary(groupLeader1));
        System.out.println("一个部门工资：" + CalculateSalary.calculateSalary(departmentLeader));

        //输出：
        /*
        一个项目工资：92000.0
        一个组工资：281000.0
        一个部门工资：892000.0
         */
    }

}
