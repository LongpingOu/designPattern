package com.ou.cn.adapterPattern;

/**
 * description: Light <br>
 * date: 2020/5/7 20:44 <br>
 * author: 夏林梦子 <br>
 */
public class Wash implements ThreeElectricOutlet {

    String name;

    public Wash() {
        this.name = "洗衣机";
    }

    @Override
    public void connectElectricCurrent() {
        System.out.println(this.name + "插在三厢插座上");
        turnOn();
    }

    public void turnOn() {
        System.out.println(name + "开始洗衣服了");
    }
}
