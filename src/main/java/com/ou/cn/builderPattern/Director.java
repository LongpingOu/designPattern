package com.ou.cn.builderPattern;

/**
 * description: Director 指挥者<br>
 * date: 2020/5/10 13:25 <br>
 * author: 夏林梦子 <br>
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * description: constructProduct 生成一个具体的产品
     * return com.ou.cn.builderPattern.Product
     * author: 夏林梦子
     * date: 2020/5/10 13:39
     */
    public Product constructProduct() {
        builder.setAddress();
        builder.setName();
        builder.setPrice();
        return builder.getProduct();
    }
}
