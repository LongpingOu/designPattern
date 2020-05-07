package com.ou.cn.commandPattern;

import lombok.Setter;

/**
 * description: Teacher <br>
 * date: 2020/5/5 15:42 <br>
 * author: 夏林梦子 <br>
 */
@Setter
public class Teacher {

    private Command command;

    private String work;

    /**
     * description: arrangeWork
     * return void
     * author: 夏林梦子
     * date: 2020/5/5 16:15
     */
    public void arrangeWork() {
        command.executeCommand(work);
    }
}
