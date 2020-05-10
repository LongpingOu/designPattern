package com.ou.cn.factoryPattern;

/**
 * description: BydCar <br>
 * date: 2020/5/10 12:25 <br>
 * author: 夏林梦子 <br>
 */
public class BydCar extends Car {

    public BydCar() {
        this.name = "比亚迪汽车";
    }

    @Override
    public void printName() {
        System.out.println("建造" + this.name);
    }
}
