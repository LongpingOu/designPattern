package com.ou.cn.facadePattern;

/**
 * description: Pay <br>
 * date: 2020/5/7 22:54 <br>
 * author: 夏林梦子 <br>
 */
public class Pay {

    private int money = 10000;

    /**
     * description: pay 付款
     * return void
     * author: 夏林梦子
     * date: 2020/5/7 23:04
     */
    public void pay() {
        System.out.println("付钱"+money+"元，购买成功！");
    }

}
