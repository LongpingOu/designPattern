package com.ou.cn.flyweightPattern;

/**
 * description: FlyweightMain <br>
 * date: 2020/5/11 21:18 <br>
 * author: 夏林梦子 <br>
 */
public class FlyweightMain {

    public static void main(String[] args) {

        //创建享元工厂对象
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSiteCategory("电商网站");
        webSite1.use();

        WebSite webSite2 = factory.getWebSiteCategory("电商网站");
        webSite2.use();

        WebSite webSite3 = factory.getWebSiteCategory("电商网站");
        webSite3.use();

        WebSite webSite4 = factory.getWebSiteCategory("博客");
        webSite4.use();

        WebSite webSite5 = factory.getWebSiteCategory("博客");
        webSite5.use();

        WebSite webSite6 = factory.getWebSiteCategory("博客");
        webSite6.use();

        System.out.println("网站种类数量：" + factory.getWebSiteCount());

        //输出：
        /*
        网站分类：产品展示
        网站分类：产品展示
        网站分类：产品展示
        网站分类：博客
        网站分类：博客
        网站分类：博客
        网站种类数量：2
         */
        // 可以看到，虽然输出了6个网站，但是其实网站池里只有2个网站对象
    }

}
