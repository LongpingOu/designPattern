package com.ou.cn.factoryPattern;

/**
 * description: FactoryMain <br>
 * date: 2020/5/10 12:36 <br>
 * author: 夏林梦子 <br>
 */
public class FactoryMain {

    public static void main(String[] args) {

        Car byd;
        // 用比亚迪汽车工厂建造比亚迪汽车
        Factoy bydFactory = new BydFactory();
        byd = bydFactory.newCar();
        byd.printName();

        // 用宝马汽车工厂建造宝马汽车
        Factoy bmFactory = new BmFactory();
        byd = bmFactory.newCar();
        byd.printName();

        // 用保时捷汽车工厂建造保时捷汽车
        Factoy bsjFactory = new BsjFactory();
        byd = bsjFactory.newCar();
        byd.printName();

        // 输出：
        /*
        比亚迪汽车工厂
        建造比亚迪汽车
        宝马汽车工厂
        建造宝马汽车
        保时捷汽车工厂
        建造保时捷汽车
         */
        // 可以看到，每个汽车工厂分别建造自己品牌的汽车，当然工厂模式也有好种，有的是根据某个参数，一个工厂就创建了所有类型的汽车
        // 看自己的具体需要来选择，但是万变不离其宗，理解到位之后，在项目中就能够灵活运用

    }

}
