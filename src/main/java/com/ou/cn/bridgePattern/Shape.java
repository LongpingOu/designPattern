package com.ou.cn.bridgePattern;

/**
 * description: Shape 抽象：图形类<br>
 * date: 2020/5/10 22:14 <br>
 * author: 夏林梦子 <br>
 */
public abstract class Shape {

    // 实现者类型对象
    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * description: draw 绘画操作
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 22:29
     */
    public abstract void draw();

}
