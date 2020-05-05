package com.ou.cn.ObserverPattern;

/**
 * description: WeiChat 微信群 也就是主题
 * date: 2020/5/5 17:13 <br>
 * author: 夏林梦子 <br>
 */
public interface WeiChat {

    /**
     * description: addEmployee 新增职员到部门群中
     * @param employee 需要新增的职员
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 17:35
     */
    public void addEmployee(Employee employee);

    /**
     * description: deleteEmployee 从部门群中删除职员
     * @param employee 需要删除的职员
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 17:35
     */
    public void deleteEmployee(Employee employee);

    /**
     * description: notifyEmployee 通知观察者
     * @param message 消息
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 17:36
     */
    public void notifyEmployee(String message);
}
