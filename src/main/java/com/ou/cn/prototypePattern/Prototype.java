package com.ou.cn.prototypePattern;

import java.io.IOException;

/**
 * description: Prototype 抽象原型 <br>
 * date: 2020/5/10 14:01 <br>
 * author: 夏林梦子 <br>
 */
public interface Prototype<T> {

    /**
     * description: cloneMe
     * return T
     * author: 夏林梦子
     * date: 2020/5/10 14:02
     */
    public T cloneMe() throws CloneNotSupportedException;

}
