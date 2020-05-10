package com.ou.cn.prototypePattern;

import lombok.Getter;

/**
 * description: Cattle 具体原型：牛<br>
 * date: 2020/5/10 14:06 <br>
 * author: 夏林梦子 <br>
 */
@Getter
public class Cattle implements Prototype<Cattle>, Cloneable {

    String name;

    int weight;

    int height;

    public Cattle(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public Cattle cloneMe() throws CloneNotSupportedException {
        return (Cattle) clone(); // 调用从Object类继承的clone()方法
    }
}
