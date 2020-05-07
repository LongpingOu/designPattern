package com.ou.cn.strategyPattern;

import lombok.Setter;

/**
 * description: CommuteResult 上下文：通勤结果<br>
 * date: 2020/5/7 19:58 <br>
 * author: 夏林梦子 <br>
 */
@Setter
public class CommuteResult {

    // 抽象通勤对象
    CommuteStrategy commuteStrategy;

    /**
     * description: commuteType 打印通勤方式
     * return void
     * author: 夏林梦子
     * date: 2020/5/7 20:01
     */
    public void commuteType() {
        if (commuteStrategy != null) {
            commuteStrategy.CommuteType();
        } else {
            System.out.println("无效的通勤方式");
        }
    }
}
