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
    }
}
