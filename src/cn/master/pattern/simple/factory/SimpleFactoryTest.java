package cn.master.pattern.simple.factory;

import cn.master.pattern.factory.model.impl.BlackHuman;
import cn.master.pattern.factory.model.impl.WhiteHuman;
import cn.master.pattern.factory.model.impl.YellowHuman;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        YellowHuman yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
        WhiteHuman whiteHuman = SimpleHumanFactory.createHuman(WhiteHuman.class);
        BlackHuman blackHuman = SimpleHumanFactory.createHuman(BlackHuman.class);

        System.out.println(yellowHuman.getSkinColor());
        System.out.println(whiteHuman.getSkinColor());
        System.out.println(blackHuman.getSkinColor());

    }
}
