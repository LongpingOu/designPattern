package com.ou.cn.statePattern;

/**
 * description: StateMain <br>
 * date: 2020/5/10 22:56 <br>
 * author: 夏林梦子 <br>
 */
public class StateMain {

    public static void main(String[] args) {
        // 创建低温对象
        TemperatureState state = new LowState(-10d);

        // 创建温度计
        Thermometer thermometer = new Thermometer();
        // 为温度计设置温度状态
        thermometer.setTemperatureState(state);
        thermometer.showMessage();

        // 创建常温对象
        state = new MiddleState(20d);
        thermometer.setTemperatureState(state);
        thermometer.showMessage();

        // 创建高温对象
        state = new HeightState(50);
        thermometer.setTemperatureState(state);
        thermometer.showMessage();

        //输出：
        /*
        -------------------
        现在温度是 -10.0属于低温状态
        -------------------
        -------------------
        现在温度是 20.0属于常温状态
        -------------------
        -------------------
        现在温度是 50.0属于高温状态
        -------------------
         */
        // 输出确实是根据不同的温度状态，温度计显示不同的提示信息了
    }

}
