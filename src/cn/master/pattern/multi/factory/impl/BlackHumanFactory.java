package cn.master.pattern.multi.factory.impl;

import cn.master.pattern.factory.model.Human;
import cn.master.pattern.factory.model.impl.BlackHuman;
import cn.master.pattern.multi.factory.AbstractHumanFactory;

public class BlackHumanFactory implements AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
