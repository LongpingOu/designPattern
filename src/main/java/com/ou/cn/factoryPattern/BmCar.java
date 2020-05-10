package com.ou.cn.factoryPattern;

/**
 * description: BydCar <br>
 * date: 2020/5/10 12:25 <br>
 * author: 夏林梦子 <br>
 */
public class BmCar extends Car {

    public BmCar() {
        this.name = "宝马汽车";
    }

    @Override
    public void printName() {
        System.out.println("建造" + this.name);
    }
}
