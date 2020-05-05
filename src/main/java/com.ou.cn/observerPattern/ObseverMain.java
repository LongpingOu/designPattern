package com.ou.cn.observerPattern;

/**
 * description: ObseverMain <br>
 * date: 2020/5/5 18:00 <br>
 * author: 夏林梦子 <br>
 */
public class ObseverMain {

    public static void main(String[] args) {

        // 创建两个微信群
        WeiChat weiChat1 = new HealthDepartment("健康部门群");
        WeiChat weiChat2 = new DataSmartDepartment("数据智能部门群");

        // 创建两个职员
        Employee employee1 = new LinZi("林子");
        Employee employee2 = new XiaMeng("夏梦");

        // 职员1 也就是林子加入到两个微信群中
        employee1.addWeiChat(weiChat1);
        employee1.addWeiChat(weiChat2);

        // 职员2 也就是夏梦加入到两个微信群中
        employee2.addWeiChat(weiChat1);
        employee2.addWeiChat(weiChat2);

        // 两个微信群第 1 次发布消息
        weiChat1.notifyEmployee("发布第 1 次消息");
        weiChat2.notifyEmployee("发布第 1 次消息");

        // 职员2 夏梦退出 健康部门群
        employee2.deleteWeiChat(weiChat1);

        // 两个微信群第 2 次发布消息
        weiChat1.notifyEmployee("发布第 2 次消息");
        weiChat2.notifyEmployee("发布第 2 次消息");


        //输出：
        /*
        林子收到：健康部门群发布第 1 次消息
        夏梦收到：健康部门群发布第 1 次消息
        林子收到：数据智能部门群发布第 1 次消息
        夏梦收到：数据智能部门群发布第 1 次消息
        职员:夏梦 退出了 健康部门群
        林子收到：健康部门群发布第 2 次消息
        林子收到：数据智能部门群发布第 2 次消息
        夏梦收到：数据智能部门群发布第 2 次消息
        */

        // 从输出就可以看到，具体职员可以对部门群的消息进行自由的订阅和取消了
    }

}
