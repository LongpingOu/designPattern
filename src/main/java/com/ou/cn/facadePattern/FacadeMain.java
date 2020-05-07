package com.ou.cn.facadePattern;

/**
 * description: FacadeMain <br>
 * date: 2020/5/7 23:05 <br>
 * author: 夏林梦子 <br>
 */
public class FacadeMain {

    public static void main(String[] args) {
        // 创建子系统外观对象
        ClientFacade clientFacade = new ClientFacade();
        // 调用购买电脑统一方法
        clientFacade.BuyComputer();

        //输出
        /*
        联想电脑
        创建订单成功
        付钱10000元，购买成功！
         */
        //可以看到，客户端这边，通过外观对象，只要调用外观对象的一个方法，就完成了整个购买过程，而不需要跟子系统直接打交道。

    }

}
