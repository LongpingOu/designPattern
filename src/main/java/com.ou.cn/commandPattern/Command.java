package com.ou.cn.commandPattern;

/**
 * description: Command <br>
 * date: 2020/5/5 15:42 <br>
 * author: 夏林梦子 <br>
 */
public interface Command {

    /**
     * description: excuteCommand 执行命令
     * @param work 命令内容
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 15:57
     */
    public void executeCommand(String work);

}
