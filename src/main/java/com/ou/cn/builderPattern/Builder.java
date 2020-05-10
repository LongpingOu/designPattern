package com.ou.cn.builderPattern;

/**
 * description: Builder 生成器<br>
 * date: 2020/5/10 13:18 <br>
 * author: 夏林梦子 <br>
 */
public interface Builder {

    /**
     * description: setName 设置名称
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 13:36
     */
    void setName();


    /**
     * description: setPrice 设置价格
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 13:36
     */
    void setPrice();


    /**
     * description: setAddress 设置地址
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 13:36
     */
    void setAddress();

    /**
     * description: getProduct 获取产品实例
     * return com.ou.cn.builderPattern.Product
     * author: 夏林梦子
     * date: 2020/5/10 13:36
     */
    Product getProduct();

}
