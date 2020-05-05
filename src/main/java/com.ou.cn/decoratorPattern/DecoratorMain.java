package com.ou.cn.decoratorPattern;

/**
 * description: DecoratorMain <br>
 * date: 2020/5/5 19:28 <br>
 * author: 夏林梦子 <br>
 */
public class DecoratorMain {

    public static void main(String[] args) {

        // 没有装饰的汽车对象
        Car car1 = new BydCarHan();

        // 装饰一次的汽车对象
        Car car2 = new CarDecorator(car1);

        // 装饰两次的汽车对象
        Car car3 = new CarDecorator(car2);

        // 打印三个汽车对象的巡航距离
        needCar(car1);
        needCar(car2);
        needCar(car3);

        //运行结果
        /*
        这辆车能跑：650km
        这辆车能跑：700km
        这辆车能跑：750km
         */
        // 从结果可以看到，每装饰一次，就增加50km航程，同一个类的不同的实例，调用同一个方法，结果是不一样的
        // 也就达到了在不修改原始类的情况下，为原始类对象新增功能的目的
    }

    /**
     * description: needCar 汽车续航距离
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 19:40
     */
    public static void needCar(Car car) {
        System.out.println("这辆车能跑：" + car.run() + "km");
    }


}
