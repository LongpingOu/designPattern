package com.ou.cn.strategyPattern;

/**
 * description: Walk  通勤策略之一：走路<br>
 * date: 2020/5/7 19:47 <br>
 * author: 夏林梦子 <br>
 */
public class Walk implements CommuteStrategy {

    @Override
    public void CommuteType() {
        System.out.println("我今天走路去上班");
    }
}
