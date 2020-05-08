package com.ou.cn.iteratorPattern;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

/**
 * description: Student <br>
 * date: 2020/5/8 20:12 <br>
 * author: 夏林梦子 <br>
 */
@Getter
public class Student {

    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * description: compareTo 根据年龄比较学生大小
     * @param student 学生对象
     * return int
     * author: 夏林梦子
     * date: 2020/5/8 20:18
     */
    public int compareTo(Student student) {
        if (this.age > student.age) {
            return 1;
        } else if (this.age < student.age){
            return -1;
        } else {
            return 0;
        }
    }

}
