package com.ou.cn.statePattern;

/**
 * description: LowState 具体状态：低温<br>
 * date: 2020/5/10 22:52 <br>
 * author: 夏林梦子 <br>
 */
public class LowState implements TemperatureState {

    double n = 0;

    public LowState(double n) {
        if(n < 0d) {
            this.n = n;
        }
    }

    @Override
    public void showTemperature() {
        System.out.println("现在温度是 " + n + "属于低温状态");
    }
}
