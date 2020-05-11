package com.ou.cn.flyweightPattern;

import java.util.HashMap;

/**
 * description: WebSiteFactory 享元工厂<br>
 * date: 2020/5/11 21:18 <br>
 * author: 夏林梦子 <br>
 */
public class WebSiteFactory {

    public HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    /**
     * description: getWebSiteCategory 获得网站分类
     * @param key 网站类别
     * return com.ou.cn.flyweightPattern.WebSite
     * author: 夏林梦子
     * date: 2020/5/11 21:27
     */
    public WebSite getWebSiteCategory(String key) {
        if(!pool.containsKey(key)) {
            pool.put(key, new ConcreteWebSite(key));
        }

        return (WebSite)pool.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount() {
        return pool.size();
    }

}