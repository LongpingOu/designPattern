package com.ou.cn.observerPattern;

/**
 * description: Linzi 具体职员林子，也就是具体的观察者<br>
 * date: 2020/5/5 17:31 <br>
 * author: 夏林梦子 <br>
 */

public class XiaMeng implements Employee {

    private String name;

    public XiaMeng(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + "收到：" + message);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addWeiChat(WeiChat weiChat) {
        weiChat.addEmployee(this);
    }

    @Override
    public void deleteWeiChat(WeiChat weiChat) {
        weiChat.deleteEmployee(this);
    }
}
