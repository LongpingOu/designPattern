package com.ou.cn.decoratorPattern;

/**
 * description: CarDecorator <br>
 * date: 2020/5/5 19:24 <br>
 * author: 夏林梦子 <br>
 */
public class CarDecorator extends Decorator {

    public final static int DISTANCE = 50;

    public CarDecorator(Car car) {
        super(car);
    }

    @Override
    public int run() {
        int distance = 0;
        distance = car.run() + extRun();
        return distance;
    }

    /**
     * description: extRun 每次装饰，增加50km距离
     * return int
     * author: 夏林梦子
     * date: 2020/5/5 19:37
     */
    private int extRun() {
        return DISTANCE;
    }
}
