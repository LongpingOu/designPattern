package com.ou.cn.proxyPattern;

/**
 * description: PrintStudentNameImpl 具体主题<br>
 * date: 2020/5/11 20:55 <br>
 * author: 夏林梦子 <br>
 */
public class PrintStudentNameImpl implements PrintStudentName {

    @Override
    public void printStudentName(Student student) {
        System.out.println("学生姓名：" + student.getName());
    }
}
