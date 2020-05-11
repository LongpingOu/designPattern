package com.ou.cn.templateMethodPattern;

/**
 * description: HighRailwayStation <br>
 * date: 2020/5/11 20:28 <br>
 * author: 夏林梦子 <br>
 */
public class HighRailwayStation extends Station {

    @Override
    void safetyExamine() {
        System.out.println("高铁开始安检");
    }

    @Override
    void validateTicket() {
        System.out.println("高铁开始检票");
    }

    @Override
    void findSeatAndDown() {
        System.out.println("上高铁找到16C座位坐下");
    }
}
