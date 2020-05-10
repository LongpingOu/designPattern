package com.ou.cn.factoryPattern;

/**
 * description: BydFactory <br>
 * date: 2020/5/10 12:33 <br>
 * author: 夏林梦子 <br>
 */
public class BsjFactory implements Factoy {

    BsjFactory() {
        System.out.println("保时捷汽车工厂");
    }

    @Override
    public Car newCar() {
        return new BsjCar();
    }
}
