package com.ou.cn.proxyPattern;

/**
 * description: ProxyMain <br>
 * date: 2020/5/11 20:59 <br>
 * author: 夏林梦子 <br>
 */
public class ProxyMain {

    public static void main(String[] args) {

        //代理PrintStudentNameImpl对象
        PrintStudentName printStudentName = new PrintStudentNameProxy(new PrintStudentNameImpl());

        //打印学生夏林的姓名
        printStudentName.printStudentName(new Student("夏林"));

        //打印学生梦子的姓名
        printStudentName.printStudentName(new Student("梦子"));

        //输出：
        /*
        方法入口记日志。。。。学生姓名：夏林
        学生姓名：夏林
        方法出口记日志。。。。学生姓名：夏林
        --------------------------------
        方法入口记日志。。。。学生姓名：梦子
        学生姓名：梦子
        方法出口记日志。。。。学生姓名：梦子
        --------------------------------
         */
        // 从输出可以看到，我们在PrintStudentNameImpl对象的方法入口和出口都打印了日志了，而不需要再PrintStudentNameImpl的方法里
        //去记录日志
    }

}
