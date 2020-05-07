package com.ou.cn.adapterPattern;

/**
 * description: ThreeElectricAdapter Adapter:适配器<br>
 * date: 2020/5/7 20:39 <br>
 * author: 夏林梦子 <br>
 */
public class ThreeElectricAdapter implements ThreeElectricOutlet {

    TwoElectricOutlet twoElectricOutlet;

    ThreeElectricAdapter(TwoElectricOutlet twoElectricOutlet) {
        this.twoElectricOutlet = twoElectricOutlet;
    }

    @Override
    public void connectElectricCurrent() {
        System.out.println(twoElectricOutlet.getName() + "插在三厢插座上");
        twoElectricOutlet.connectElectricCurrent();
    }
}
