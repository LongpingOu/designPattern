package com.ou.cn.chainOfResponsibilityPattern;

/**
 * description: Handler 处理者<br>
 * date: 2020/5/7 21:22 <br>
 * author: 夏林梦子 <br>
 */
public interface Handler {

    /**
     * description: handlerRequest 处理请求
     * @param number 需要处理的编号
     * return void
     * author: 夏林梦子
     * date: 2020/5/7 21:24
     */
    void handlerRequest(String number);


    /**
     * description: setNextHandler 下一个处理者
     * @param handler 设置后继处理者
     * return void
     * author: 夏林梦子
     * date: 2020/5/7 21:24
     */
    void setNextHandler(Handler handler);

}
