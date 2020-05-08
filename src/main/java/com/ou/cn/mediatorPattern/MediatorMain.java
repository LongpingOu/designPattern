package com.ou.cn.mediatorPattern;

/**
 * description: MediatorMain <br>
 * date: 2020/5/8 21:52 <br>
 * author: 夏林梦子 <br>
 */
public class MediatorMain {
    public static void main(String[] args) {
        // 创建中介者
        Mediator mediator = new ConcreteMediator();

        // 创建买家
        BuyerColleague buyer1 = new BuyerColleague(mediator, "看房者1");
        BuyerColleague buyer2 = new BuyerColleague(mediator, "看房者2");

        // 创建卖家
        SellerColleague seller1 = new SellerColleague(mediator, "楼盘1");
        SellerColleague seller2 = new SellerColleague(mediator, "楼盘2");

        // 买家发布求购信息
        buyer1.sendMessage("我要买一套复式楼");
        buyer2.sendMessage("我要买一套别墅");
        // 卖家发布楼盘信息
        seller1.sendMessage("我这里有30套房，优惠多多");
        seller2.sendMessage("新楼盘开卖，1万抵5万");

        // 输出
        /*
        看房者1发布信息：我要买一套复式楼
        楼盘1收到来自看房者1的信息：我要买一套复式楼
        楼盘2收到来自看房者1的信息：我要买一套复式楼
        看房者2发布信息：我要买一套别墅
        楼盘1收到来自看房者2的信息：我要买一套别墅
        楼盘2收到来自看房者2的信息：我要买一套别墅
        楼盘1发布信息：我这里有30套房，优惠多多
        看房者1收到来自楼盘1的信息：我这里有30套房，优惠多多
        看房者2收到来自楼盘1的信息：我这里有30套房，优惠多多
        楼盘2发布信息：新楼盘开卖，1万抵5万
        看房者1收到来自楼盘2的信息：新楼盘开卖，1万抵5万
        看房者2收到来自楼盘2的信息：新楼盘开卖，1万抵5万
         */

        // 从输出可以看到，卖家和买家都是从中介者那里获取到了对方发布的消息
    }
}
