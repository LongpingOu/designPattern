package com.ou.cn.commandPattern;

/**
 * description: Student <br>
 * date: 2020/5/5 15:42 <br>
 * author: 夏林梦子 <br>
 */
public class Student {

    /**
     * description: doWork 学生执行老师布置的作业
     * @param work 具体作业
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 16:04
     */
    public void doWork(String work) {
        System.out.println("老师，我们收到，正在执行：" + work);
    }

}
