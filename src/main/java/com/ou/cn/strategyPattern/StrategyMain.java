package com.ou.cn.strategyPattern;

/**
 * description: StrategyMain <br>
 * date: 2020/5/7 20:01 <br>
 * author: 夏林梦子 <br>
 */
public class StrategyMain {

    public static void main(String[] args) {
        CommuteResult commuteResult = new CommuteResult();
        // 策略一：走路
        commuteResult.setCommuteStrategy(new Walk());
        commuteResult.commuteType();

        //策略二：坐地铁
        commuteResult.setCommuteStrategy(new TakeTheSubway());
        commuteResult.commuteType();

        //策略三： 走路
        commuteResult.setCommuteStrategy(new DriveACar());
        commuteResult.commuteType();

        //输出
        /*
        我今天走路去上班
        我今天坐地铁去上班
        我今天开车去上班
         */
        //从输出我们可以看到，上下文CommuteResult（Context）与具体策略TakeTheSubway(ConcreteStrategy)
        //是松耦合的关系，上下文只需要知道它使用了某一个实现接口类的实例，单不需要知道具体是哪一个类，
        //随着业务的需要，我们还可以不停的新增别的策略，而对之前的代码不会有任何影响
    }

}
