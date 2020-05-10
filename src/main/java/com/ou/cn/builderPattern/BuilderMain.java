package com.ou.cn.builderPattern;

/**
 * description: BuilderMain <br>
 * date: 2020/5/10 13:28 <br>
 * author: 夏林梦子 <br>
 */
public class BuilderMain {

    public static void main(String[] args) {
        // 创建生成器对象
        Builder builder = new ConcreteBuilder();

        // 创建指挥者对象,并且设置生成器
        Director director = new Director(builder);

        //  通过指挥者生成具体产品对象
        Product product = director.constructProduct();

        System.out.println("商品信息：名称" + product.getName() + " 价格：" + product.getPrice() + " 地址：" + product.getAddress());

        //输出：
        /*
        商品信息：名称name 价格：20 地址：address
         */
        // 可以看到，我们省去了客户端繁杂的Setter方法或者一堆参数的构造方法 不同对象可以创建不同的生成器来构造

    }

}
