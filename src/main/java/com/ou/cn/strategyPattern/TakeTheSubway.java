package com.ou.cn.strategyPattern;

/**
 * description: TakeTheSubway  通勤策略之一：地铁<br>
 * date: 2020/5/7 19:47 <br>
 * author: 夏林梦子 <br>
 */
public class TakeTheSubway implements CommuteStrategy {

    @Override
    public void CommuteType() {
        System.out.println("我今天坐地铁去上班");
    }
}
