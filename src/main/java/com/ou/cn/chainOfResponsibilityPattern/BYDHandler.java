package com.ou.cn.chainOfResponsibilityPattern;

/**
 * description: BYDHandler 比亚迪汽车品牌处理器<br>
 * date: 2020/5/7 21:25 <br>
 * author: 夏林梦子 <br>
 */
public class BYDHandler implements Handler {

    String number = "BYD";

    // 后继处理器的引用
    Handler handler;

    @Override
    public void handlerRequest(String number) {
        if (this.number.equals(number)) {
            System.out.println(number + "：这是比亚迪汽车");
        } else {
            System.out.println(number + "：不是比亚迪汽车，交给下一个汽车品牌识别器处理");
            if (this.handler == null) {
                System.out.println(number + "：无法识别此汽车品牌");
            } else {
                handler.handlerRequest(number);
            }
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
