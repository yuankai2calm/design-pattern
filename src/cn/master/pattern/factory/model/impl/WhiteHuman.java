package cn.master.pattern.factory.model.impl;

import cn.master.pattern.factory.model.Human;

public class WhiteHuman implements Human {
    @Override
    public void talk() {
        System.out.println("白种人主要说英文");
    }

    @Override
    public String getSkinColor() {
        System.out.println("皮肤颜色是白色");
        return "white";
    }
}
