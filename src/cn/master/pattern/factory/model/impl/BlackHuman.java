package cn.master.pattern.factory.model.impl;

import cn.master.pattern.factory.model.Human;

public class BlackHuman implements Human {
    @Override
    public void talk() {
        System.out.println("大部分黑人说自己的方言");
    }

    @Override
    public String getSkinColor() {
        System.out.println("皮肤颜色是黑色");
        return "black";
    }
}
