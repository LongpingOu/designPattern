package com.ou.cn.proxyPattern;

/**
 * description: PrintStudentName 抽象主题 <br>
 * date: 2020/5/11 20:54 <br>
 * author: 夏林梦子 <br>
 */
public interface PrintStudentName {

    /**
     * description: printStudentName 打印学生姓名
     * @param student 学生
     * return void
     * author: 夏林梦子
     * date: 2020/5/11 20:55
     */
    void printStudentName(Student student);

}
