package com.ou.cn.builderPattern;

/**
 * description: ConcreteBuilder 具体生成器<br>
 * date: 2020/5/10 13:20 <br>
 * author: 夏林梦子 <br>
 */
public class ConcreteBuilder implements Builder {

    Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }


    @Override
    public void setName() {
        product.setName("name");
    }

    @Override
    public void setPrice() {
        product.setPrice(20);
    }

    @Override
    public void setAddress() {
        product.setAddress("address");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
