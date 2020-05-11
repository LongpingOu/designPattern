package com.ou.cn.templateMethodPattern;

/**
 * description: TemplateMethodMain <br>
 * date: 2020/5/11 20:32 <br>
 * author: 夏林梦子 <br>
 */
public class TemplateMethodMain {

    public static void main(String[] args) {

        // 乘坐飞机
        Station airportStation = new AirportStation();
        airportStation.ridingStep();

        //乘坐高铁
        Station highRailwayStation = new HighRailwayStation();
        highRailwayStation.ridingStep();

        //输出：
        /*
        机场开始安检
        机场开始检票
        上飞机找到41号座位坐下
        ============================
        高铁开始安检
        高铁开始检票
        上高铁找到16C座位坐下
        ============================
         */
        //将不同的方法按一定的步骤组合在一个方法上，使用的时候直接调用该模板方法
    }

}
