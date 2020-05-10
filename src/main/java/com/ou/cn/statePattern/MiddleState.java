package com.ou.cn.statePattern;

/**
 * description: LowState 具体状态：常温<br>
 * date: 2020/5/10 22:52 <br>
 * author: 夏林梦子 <br>
 */
public class MiddleState implements TemperatureState {

    double n = 0;

    public MiddleState(double n) {
        if(n > 10 && n < 26d) {
            this.n = n;
        }
    }

    @Override
    public void showTemperature() {
        System.out.println("现在温度是 " + n + "属于常温状态");
    }
}
