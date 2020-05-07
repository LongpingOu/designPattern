package com.ou.cn.chainOfResponsibilityPattern;

/**
 * description: ReponsibilityMain <br>
 * date: 2020/5/7 21:35 <br>
 * author: 夏林梦子 <br>
 */
public class ResponsibilityMain {

    // 定义三个汽车品牌识别器
    private static Handler byd, bm, bsj;

    public static void main(String[] args) {
        // 调用 创建汽车品牌识别器 方法 创建 汽车品牌识别器
        createChain();

        // 发出汽车品牌识别请求
        request("BYD");
        request("BSJ");
        request("HM");

        //输出
        /*
        BYD：这是比亚迪汽车
        BSJ：不是比亚迪汽车，交给下一个汽车品牌识别器处理
        BSJ：不是宝马汽车，交给下一个汽车品牌识别器处理
        BSJ：这是保时捷汽车
        HM：不是比亚迪汽车，交给下一个汽车品牌识别器处理
        HM：不是宝马汽车，交给下一个汽车品牌识别器处理
        HM：不是保时捷汽车，交给下一个汽车品牌识别器处理
        HM：无法识别此汽车品牌
         */
        // 从输出可以看出，如果有某个汽车品牌识别器识别出来了，就不会传递个下一个，否则就会传递个下一个继续识别
    }

    /**
     * description: request 识别汽车品牌请求
     * @param number 传入的汽车品牌
     * return void
     * author: 夏林梦子
     * date: 2020/5/7 21:44
     */
    private static void request(String number){
        byd.handlerRequest(number);
    }

    /**
     * description: createChain 创建汽车品牌识别器
     * return void
     * author: 夏林梦子
     * date: 2020/5/7 21:43
     */
    private static void createChain() {
        byd = new BYDHandler();
        bm = new BMHandler();
        bsj = new BSJHandler();
        byd.setNextHandler(bm);
        bm.setNextHandler(bsj);
    }

}
