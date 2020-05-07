package com.ou.cn.commandPattern;

import lombok.Setter;

/**
 * description: ConcreteCommand <br>
 * date: 2020/5/5 15:42 <br>
 * author: 夏林梦子 <br>
 */
public class ConcreteCommand implements Command{

    private Student student;

    public ConcreteCommand(Student student) {
        this.student = student;
    }

    @Override
    public void executeCommand(String work) {
        student.doWork(work);
    }


}
