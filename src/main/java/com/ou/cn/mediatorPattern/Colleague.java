package com.ou.cn.mediatorPattern;

/**
 * description: Colleague 同事<br>
 * date: 2020/5/8 21:38 <br>
 * author: 夏林梦子 <br>
 */
public interface Colleague {

    /**
     * description: sendMessage 发布信息
     * @param message 信息
     * return void
     * author: 夏林梦子
     * date: 2020/5/8 22:06
     */
    void sendMessage(String message);

    /**
     * description: getMessage 收到信息
     * @param message 信息
     * return void
     * author: 夏林梦子
     * date: 2020/5/8 22:06
     */
    void getMessage(String message);

    /**
     * description: getName 获取具体同事名称
     * return java.lang.String
     * author: 夏林梦子
     * date: 2020/5/8 22:06
     */
    String getName();

}
