package com.ou.cn.templateMethodPattern;

/**
 * description: Station 抽象模板：交通工具站点 <br>
 * date: 2020/5/11 20:23 <br>
 * author: 夏林梦子 <br>
 */
public abstract class Station {

    /**
     * description: safetyExamine 安检
     * return void
     * author: 夏林梦子
     * date: 2020/5/11 20:26
     */
    abstract void safetyExamine();

    /**
     * description: validateTicket 检票
     * return void
     * author: 夏林梦子
     * date: 2020/5/11 20:26
     */
    abstract void validateTicket();

    /**
     * description: findSeatAndDown 做到座位并坐下
     * return void
     * author: 夏林梦子
     * date: 2020/5/11 20:26
     */
    abstract void findSeatAndDown();

    /**
     * description: ridingStep 将固定的方法固定成一连串的步骤
     * return void
     * author: 夏林梦子
     * date: 2020/5/11 20:26
     */
    void ridingStep(){
        safetyExamine();
        validateTicket();
        findSeatAndDown();
        System.out.println("============================");
    }

}
