package com.ou.cn.statePattern;

/**
 * description: LowState 具体状态：高温<br>
 * date: 2020/5/10 22:52 <br>
 * author: 夏林梦子 <br>
 */
public class HeightState implements TemperatureState {

    double n = 0;

    public HeightState(double n) {
        if(n > 38) {
            this.n = n;
        }
    }

    @Override
    public void showTemperature() {
        System.out.println("现在温度是 " + n + "属于高温状态");
    }
}
