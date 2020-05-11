package com.ou.cn.templateMethodPattern;

/**
 * description: HighRailwayStation <br>
 * date: 2020/5/11 20:28 <br>
 * author: 夏林梦子 <br>
 */
public class AirportStation extends Station {

    @Override
    void safetyExamine() {
        System.out.println("机场开始安检");
    }

    @Override
    void validateTicket() {
        System.out.println("机场开始检票");
    }

    @Override
    void findSeatAndDown() {
        System.out.println("上飞机找到41号座位坐下");
    }
}
