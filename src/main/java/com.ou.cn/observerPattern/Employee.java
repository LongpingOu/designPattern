package com.ou.cn.observerPattern;

/**
 * description: Employee 公司职员，也就是观察者<br>
 * date: 2020/5/5 17:28 <br>
 * author: 夏林梦子 <br>
 */
public interface Employee {

    /**
     * description: getMessage 更新信息
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 17:30
     */
    public void getMessage(String message);

    /**
     * description: getName 获取职员名字
     * return java.lang.String
     * author: 夏林梦子
     * date: 2020/5/5 17:45
     */
    public String getName();
    
    /**
     * description: addWeiChat 加入微信群
     * @param weiChat 微信群
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 17:56
     */
    public void addWeiChat(WeiChat weiChat);

    /**
     * description: deleteWeiChat 退出微信群
     * @param weiChat 微信群
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 18:11
     */
    public void deleteWeiChat(WeiChat weiChat);

}
