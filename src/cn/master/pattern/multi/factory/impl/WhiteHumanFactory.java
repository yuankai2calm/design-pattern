package cn.master.pattern.multi.factory.impl;

import cn.master.pattern.factory.model.Human;
import cn.master.pattern.factory.model.impl.WhiteHuman;
import cn.master.pattern.multi.factory.AbstractHumanFactory;

public class WhiteHumanFactory implements AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
