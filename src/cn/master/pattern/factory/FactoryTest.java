package cn.master.pattern.factory;

import cn.master.pattern.factory.model.impl.BlackHuman;
import cn.master.pattern.factory.model.impl.WhiteHuman;
import cn.master.pattern.factory.model.impl.YellowHuman;


public class FactoryTest {

    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);

        System.out.println(yellowHuman.getSkinColor());
        System.out.println(whiteHuman.getSkinColor());
        System.out.println(blackHuman.getSkinColor());
    }
}
