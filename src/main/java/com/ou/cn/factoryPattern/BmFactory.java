package com.ou.cn.factoryPattern;

/**
 * description: BydFactory <br>
 * date: 2020/5/10 12:33 <br>
 * author: 夏林梦子 <br>
 */
public class BmFactory implements Factoy {

    BmFactory() {
        System.out.println("宝马汽车工厂");
    }

    @Override
    public Car newCar() {
        return new BmCar();
    }
}
