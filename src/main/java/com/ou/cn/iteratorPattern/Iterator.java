package com.ou.cn.iteratorPattern;

/**
 * description: Iterator 迭代器， 我们这里主要只实现两个最基本的方法<br>
 * date: 2020/5/8 20:22 <br>
 * author: 夏林梦子 <br>
 */
public interface Iterator<T> {

    /**
     * description: next 获取集合下一个元素
     * return T 元素
     * author: 夏林梦子
     * date: 2020/5/8 20:54
     */
    T next();

    /**
     * description: hasNext 判断是否还有元素能继续获取
     * return boolean
     * author: 夏林梦子
     * date: 2020/5/8 20:54
     */
    boolean hasNext();
}
