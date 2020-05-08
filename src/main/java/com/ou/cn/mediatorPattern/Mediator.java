package com.ou.cn.mediatorPattern;

/**
 * description: Mediator 中介者<br>
 * date: 2020/5/8 21:40 <br>
 * author: 夏林梦子 <br>
 */
public interface Mediator {

    /**
     * description: registerBuyer 注册买家同事
     * @param colleague 具体买家对象
     * return void
     * author: 夏林梦子
     * date: 2020/5/8 22:07
     */
    void registerBuyer(Colleague colleague);

    /**
     * description: registerSeller 注册卖家同事
     * @param colleague 具体买家对象
     * return void
     * author: 夏林梦子
     * date: 2020/5/8 22:07
     */
    void registerSeller(Colleague colleague);

    /**
     * description: deliverMessage 同事通过中介发布信息
     * @param colleague 具体同事
     * @param message 信息
     * return void
     * author: 夏林梦子
     * date: 2020/5/8 22:07
     */
    void deliverMessage(Colleague colleague, String message);

}
