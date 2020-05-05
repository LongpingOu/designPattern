package com.ou.cn.commandPattern;

/**
 * description: CommandPatternMain <br>
 * date: 2020/5/5 16:26 <br>
 * author: 夏林梦子 <br>
 */
public class CommandPatternMain {

    public static void main(String[] args) {
        // 创建学生对象
        Student student = new Student();
        // 创建命令对象，并且设置命令执行者
        Command command = new ConcreteCommand(student);
        // 创建老师对象
        Teacher teacher = new Teacher();
        // 布置作业
        teacher.setWork("做数学作业！");
        // 设置命令
        teacher.setCommand(command);
        // 发布布置作业的命令
        teacher.arrangeWork();


        //输出：
        /*
        老师，我们收到，正在执行：做数学作业！
         */

        //可以看到，老师没有对学生直接发布作业，但是学生可以正常收到布置作业的信息了
    }

}
