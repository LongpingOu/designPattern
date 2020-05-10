package com.ou.cn.bridgePattern;

/**
 * description: RedCircle 具体实现者：画绿色圆的类 <br>
 * date: 2020/5/10 22:13 <br>
 * author: 夏林梦子 <br>
 */
public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", y: "+ y +"]");
    }
}
