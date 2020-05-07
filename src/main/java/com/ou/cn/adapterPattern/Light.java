package com.ou.cn.adapterPattern;

import lombok.Getter;

/**
 * description: Light <br>
 * date: 2020/5/7 20:44 <br>
 * author: 夏林梦子 <br>
 */

public class Light implements TwoElectricOutlet {

    String name;

    public Light() {
        this.name = "台灯";
    }

    @Override
    public void connectElectricCurrent() {
        turnOn();
    }

    public void turnOn() {
        System.out.println(name + "亮了");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
