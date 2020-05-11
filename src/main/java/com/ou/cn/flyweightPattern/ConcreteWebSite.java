package com.ou.cn.flyweightPattern;

/**
 * description: ConcreteWebSite 具体享元<br>
 * date: 2020/5/11 21:17 <br>
 * author: 夏林梦子 <br>
 */
public class ConcreteWebSite implements WebSite {
    // 网站类别
    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类：" + name);
    }
}
