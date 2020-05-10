package com.ou.cn.bridgePattern;

/**
 * description: RedCircle 具体实现者：画红色圆的类 <br>
 * date: 2020/5/10 22:13 <br>
 * author: 夏林梦子 <br>
 */
public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", y: "+ y +"]");
    }
}
