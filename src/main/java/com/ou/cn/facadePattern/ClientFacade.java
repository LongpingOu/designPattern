package com.ou.cn.facadePattern;

/**
 * description: ClientFacade 外观<br>
 * date: 2020/5/7 22:56 <br>
 * author: 夏林梦子 <br>
 */
public class ClientFacade {

    private ChooseComputer chooseComputer;

    private CreateOrder createOrder;

    private Pay pay;

    public ClientFacade() {
        chooseComputer = new ChooseComputer();
        createOrder = new CreateOrder();
        pay = new Pay();
    }

    /**
     * description: BuyComputer 买电脑统一入口方法
     * return void
     * author: 夏林梦子
     * date: 2020/5/7 23:02
     */
    public void BuyComputer() {
        chooseComputer.chooseComputer();
        createOrder.createOrder();
        pay.pay();
    }

}
