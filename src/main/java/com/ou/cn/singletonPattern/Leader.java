package com.ou.cn.singletonPattern;

import lombok.Getter;

/**
 * description: Leader <br>
 * date: 2020/5/10 14:50 <br>
 * author: 夏林梦子 <br>
 */
@Getter
public class Leader {

    private static Leader leader;

    private String name;

    private Leader() {
        this.name = "夏林梦子";
    }

    /**
     * description: printName 打印领导名字
     * return void
     * author: 夏林梦子
     * date: 2020/5/10 14:54
     */
    public void printName() {
        System.out.println(this.name);
    }

    /**
     * description: getInstance 创建Leader实例，如果已经被创建则直接返回，否则创建实例
     * 加synchronized 是为了解决多线程问题
     * return com.ou.cn.singletonPattern.Leader
     * author: 夏林梦子
     * date: 2020/5/10 14:56
     */
    public static synchronized Leader getInstance() {
        if (leader == null) {
            leader = new Leader();
        }
        return leader;
    }

}
