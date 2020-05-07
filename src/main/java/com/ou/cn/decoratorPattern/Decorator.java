package com.ou.cn.decoratorPattern;

/**
 * description: Decotor <br>
 * date: 2020/5/5 19:22 <br>
 * author: 夏林梦子 <br>
 */
public abstract class Decorator implements Car {

    // 要装饰的对象
    protected Car car;

    public Decorator(Car car) {
        this.car = car;
    }

}
