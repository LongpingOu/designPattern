package com.ou.cn.strategyPattern;

/**
 * description: DriveACar 通勤策略之一：开车<br>
 * date: 2020/5/7 19:54 <br>
 * author: 夏林梦子 <br>
 */
public class DriveACar implements CommuteStrategy {

    @Override
    public void CommuteType() {
        System.out.println("我今天开车去上班");
    }
}
