package com.ou.cn.compositePattern;

import java.util.Iterator;

/**
 * description: CaculateSalary <br>
 * date: 2020/5/10 15:57 <br>
 * author: 夏林梦子 <br>
 */
public class CalculateSalary {

    /**
     * description: calculateSalary 计算当前层级的薪资总额
     * @param employee 当前层级员工
     * return java.lang.Double
     * author: 夏林梦子
     * date: 2020/5/10 16:03
     */
    public static Double calculateSalary(DepartmentEmployee employee) {
        Double num = 0d;
        if (employee.isLeaf()) {
            num = num + employee.getSalary();
        }
        if (!employee.isLeaf()) {
            num = num + employee.getSalary();
            Iterator<DepartmentEmployee> allChildren = employee.getAllChildren();
            while (allChildren.hasNext()) {
                DepartmentEmployee next = allChildren.next();
                // 递归调用完成薪资计算
                num = num + calculateSalary(next);
            }
        }
        return num;
    }

}
