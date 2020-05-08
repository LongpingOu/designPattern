package com.ou.cn.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * description: ConcreteMediator <br>
 * date: 2020/5/8 21:43 <br>
 * author: 夏林梦子 <br>
 */
public class ConcreteMediator implements Mediator {

    private List<Colleague> buyerList;

    private List<Colleague> sellerList;

    @Override
    public void registerBuyer(Colleague colleague) {
        if (buyerList == null) {
            buyerList = new ArrayList<>();
        }
        buyerList.add(colleague);
    }

    @Override
    public void registerSeller(Colleague colleague) {
        if (sellerList == null) {
            sellerList = new ArrayList<>();
        }
        sellerList.add(colleague);
    }

    @Override
    public void deliverMessage(Colleague colleague, String message) {
        System.out.println(colleague.getName() + "发布信息：" + message);
        if (buyerList.contains(colleague)) {
            sellerList.forEach(colleague1 -> {
                colleague1.getMessage(colleague1.getName() +"收到来自" + colleague.getName() + "的信息：" + message);
            });
        } else {
            buyerList.forEach(colleague1 -> {
                colleague1.getMessage(colleague1.getName() +"收到来自" + colleague.getName() + "的信息：" + message);
            });
        }
    }
}
