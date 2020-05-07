package com.ou.cn.adapterPattern;

/**
 * description: AdapterMain <br>
 * date: 2020/5/7 20:43 <br>
 * author: 夏林梦子 <br>
 */
public class AdapterMain {

    public static void main(String[] args) {
        // 洗衣机不需要适配，所以直接赋值就行
        ThreeElectricOutlet outlet = new Wash();
        outlet.connectElectricCurrent();

        //台灯需要进行适配，经过适配器适配之后，再进行赋值
        Light light = new Light();
        ThreeElectricAdapter adapter = new ThreeElectricAdapter(light);
        outlet = adapter;
        outlet.connectElectricCurrent();

        //输出
        /*
        洗衣机插在三厢插座上
        洗衣机开始洗衣服了
        台灯插在三厢插座上
        台灯亮了
         */
        // 我们可以看到，经过适配之后，台灯也可以使用三厢插座了
    }

}
