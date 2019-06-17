package cn.master.pattern.multi.factory.impl;

import cn.master.pattern.factory.model.Human;
import cn.master.pattern.factory.model.impl.YellowHuman;
import cn.master.pattern.multi.factory.AbstractHumanFactory;

public class YellowHumanFactory implements AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
