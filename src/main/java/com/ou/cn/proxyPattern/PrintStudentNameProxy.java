package com.ou.cn.proxyPattern;

/**
 * description: PrintStudentNameProxy 代理 <br>
 * date: 2020/5/11 20:57 <br>
 * author: 夏林梦子 <br>
 */
public class PrintStudentNameProxy implements PrintStudentName {

    // 需要代理的对象
    PrintStudentName printStudentName;

    public PrintStudentNameProxy(PrintStudentName printStudentName) {
        this.printStudentName = printStudentName;
    }

    @Override
    public void printStudentName(Student student) {
        System.out.println("方法入口记日志。。。。学生姓名：" + student.getName());
        printStudentName.printStudentName(student);
        System.out.println("方法出口记日志。。。。学生姓名：" + student.getName());
        System.out.println("--------------------------------");
    }
}
