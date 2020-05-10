package com.ou.cn.bridgePattern;

/**
 * description: BridgePatternMain <br>
 * date: 2020/5/10 22:16 <br>
 * author: 夏林梦子 <br>
 */
public class BridgePatternMain {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        // 输出：
        /*
        Drawing Circle[ color: red, radius: 10, x: 100, y: 100]
        Drawing Circle[ color: green, radius: 10, x: 100, y: 100]
         */
        // 这样，如果要画新的圆，只要在增加一个具体实现者，然后传给细化抽象，就可以画出来了，不需要更改之前的代码，也不需要新建绘画类
    }
}
