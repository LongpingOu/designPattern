package com.ou.cn.proxyPattern;

import lombok.Getter;

/**
 * description: Student <br>
 * date: 2020/5/11 20:51 <br>
 * author: 夏林梦子 <br>
 */
@Getter
public class Student {

    // 名字
    private String name;

    public Student(String name) {
        this.name = name;
    }
}
