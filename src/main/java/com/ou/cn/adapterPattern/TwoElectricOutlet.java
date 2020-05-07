package com.ou.cn.adapterPattern;

/**
 * description: TwoElectricOutlet Adapted：被适配者 <br>
 * date: 2020/5/7 20:38 <br>
 * author: 夏林梦子 <br>
 */
public interface TwoElectricOutlet {

    /**
     * description: connectElectricCurrent 当前连接电源
     * return void
     * author: 夏林梦子
     * date: 2020/5/7 20:37
     */
    void connectElectricCurrent();

    /**
     * description: getName 获取被适配者名称，仅仅只是为了获取名称，可以不要这个方法
     * return java.lang.String
     * author: 夏林梦子
     * date: 2020/5/7 20:58
     */
    String getName();
}
