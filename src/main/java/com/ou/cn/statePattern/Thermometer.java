package com.ou.cn.statePattern;

/**
 * description: Thermometer 环境：温度计 <br>
 * date: 2020/5/10 22:47 <br>
 * author: 夏林梦子 <br>
 */
public class Thermometer {

    //温度状态
    TemperatureState temperatureState;

    /**
     * description: showMessage 显示提示信息
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 22:51
     */
    public void showMessage() {
        System.out.println("-------------------");
        temperatureState.showTemperature();
        System.out.println("-------------------");
    }

    /**
     * description: setTemperatureState 设置温度状态对象
     * @param state 温度状态对象
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 22:53
     */
    public void setTemperatureState(TemperatureState state) {
        this.temperatureState = state;
    }
}
