package cn.master.pattern.multi.factory;

import cn.master.pattern.factory.model.Human;
import cn.master.pattern.multi.factory.impl.BlackHumanFactory;
import cn.master.pattern.multi.factory.impl.WhiteHumanFactory;
import cn.master.pattern.multi.factory.impl.YellowHumanFactory;

/**
 * 工厂模式的扩展,多工厂模式
 */
public class MultiFactoryTest {

    public static void main(String[] args) {
        Human yellowHuman = new YellowHumanFactory().createHuman();
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        Human blackHuman = new BlackHumanFactory().createHuman();


        System.out.println(yellowHuman.getSkinColor());
        System.out.println(whiteHuman.getSkinColor());
        System.out.println(blackHuman.getSkinColor());
    }
}
