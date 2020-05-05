package com.ou.cn.ObserverPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * description: HealthDepartment 具体微信群，健康部门群，也就是我们具体主题<br>
 * date: 2020/5/5 17:36 <br>
 * author: 夏林梦子 <br>
 */
public class HealthDepartment implements WeiChat {

    private List<Employee> employeeList;

    private String name;

    public HealthDepartment(String name) {
        this.name = name;
    }

    @Override
    public void addEmployee(Employee employee) {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        employeeList.add(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        if (employeeList !=null && employeeList.size() != 0 ) {
            if (employeeList.contains(employee)) {
                employeeList.remove(employee);
                System.out.println("职员:" + employee.getName() + " 退出了 " + this.name);
            }
        }
    }

    @Override
    public void notifyEmployee(String message) {
        if (employeeList !=null && employeeList.size() != 0 ) {
            employeeList.forEach(employee -> {
                employee.getMessage(this.name + message);
            });
        }
    }
}
