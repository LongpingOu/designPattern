package com.ou.cn.mediatorPattern;

/**
 * description: ConcreteColleague <br>
 * date: 2020/5/8 21:50 <br>
 * author: 夏林梦子 <br>
 */
public class BuyerColleague implements Colleague {

    Mediator mediator;

    private String name;

    public BuyerColleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.mediator.registerBuyer(this);
    }

    @Override
    public void sendMessage(String message) {
        mediator.deliverMessage(this, message);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
