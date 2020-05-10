package com.ou.cn.prototypePattern;

/**
 * description: PrototypeMain <br>
 * date: 2020/5/10 14:18 <br>
 * author: 夏林梦子 <br>
 */
public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        // 创建一头牛的对象
        Cattle cattle1 = new Cattle("小牛", 20, 20);
        System.out.println("名称：" + cattle1.getName() + " 宽：" +cattle1.getWeight()+ " 高：" + cattle1.getHeight());

        // 复制一头牛
        Cattle cattle2 = cattle1.cloneMe();
        System.out.println("名称：" + cattle2.getName() + " 宽：" +cattle2.getWeight()+ " 高：" + cattle2.getHeight());


        // 创建一只羊的对象
        Sheep sheep1 = new Sheep("小羊", 10, 10);
        System.out.println("名称：" + sheep1.getName() + " 宽：" +sheep1.getWeight()+ " 高：" + sheep1.getHeight());

        // 复制一只羊
        Sheep sheep2 = sheep1.cloneMe();
        System.out.println("名称：" + sheep2.getName() + " 宽：" +sheep2.getWeight()+ " 高：" + sheep2.getHeight());

        //输出：
        /*
        名称：小牛 宽：20 高：20
        名称：小牛 宽：20 高：20
        名称：小羊 宽：10 高：10
        名称：小羊 宽：10 高：10
         */
        // 这就我们的原型模式，利用clone()方法实现对象的复制。
    }

}