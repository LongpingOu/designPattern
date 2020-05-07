package com.ou.cn.decoratorPattern;

/**
 * description: BydCarHan <br>
 * date: 2020/5/5 19:20 <br>
 * author: 夏林梦子 <br>
 */
public class BydCarHan implements Car {

    // 正常汽车只能跑650km
    public final static int DISTANCE = 650;

    @Override
    public int run() {
        return this.DISTANCE;
    }
}
