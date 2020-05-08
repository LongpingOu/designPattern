package com.ou.cn.iteratorPattern;

/**
 * description: Aggregate 集合：主要是定义三个方法<br>
 * date: 2020/5/8 20:11 <br>
 * author: 夏林梦子 <br>
 */
public interface Aggregate<T> {

    /**
     * description: add 往集合里添加元素
     * @param t 元素
     * return void
     * author: 夏林梦子
     * date: 2020/5/8 20:55
     */
    void add(T t);

    /**
     * description: remove 从集合里删除元素
     * @param t 元素
     * return void
     * author: 夏林梦子
     * date: 2020/5/8 20:55
     */
    void remove(T t);

    /**
     * description: iterator 获取该集合的迭代器，每次都获取一个新的迭代器
     * return com.ou.cn.iteratorPattern.Iterator
     * author: 夏林梦子
     * date: 2020/5/8 20:56
     */
    Iterator iterator();
}
