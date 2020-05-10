package com.ou.cn.singletonPattern;

/**
 * description: SingletonMain <br>
 * date: 2020/5/10 14:58 <br>
 * author: 夏林梦子 <br>
 */
public class SingletonMain {


    public static void main(String[] args) {
        // 通过静态方法获取单列对象
        Leader instance1 = Leader.getInstance();
        System.out.println(instance1.getName());

        // 在获取一次对象，判断是否是同一个对象
        Leader instance2 = Leader.getInstance();
        System.out.println("是否是同一个对象：");
        System.out.println(instance2 == instance1);

        // 输出：
        /*
        夏林梦子
        是否是同一个对象：
        true
         */
        // 可以看到，两次获取的都是同一个对象，其实不管后面再获取多少次，都是同一个对象
    }

}
