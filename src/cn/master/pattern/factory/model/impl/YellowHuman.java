package cn.master.pattern.factory.model.impl;

import cn.master.pattern.factory.model.Human;

public class YellowHuman implements Human {
    @Override
    public void talk() {
        System.out.println("大多数黄种人主要说中文");
    }

    @Override
    public String getSkinColor() {
        System.out.println("皮肤颜色是黄色");
        return "yellow";
    }
}
