package com.ou.cn.bridgePattern;

/**
 * description: Circle 细化抽象：圆<br>
 * date: 2020/5/10 22:15 <br>
 * author: 夏林梦子 <br>
 */
public class Circle extends Shape {
    int x, y, radius;

    protected Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
