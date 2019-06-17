package cn.master.pattern.simple.factory;

import cn.master.pattern.factory.model.Human;

/**
 * 工厂模式的简化，简单工厂模式，也称为静态工厂模式
 */
public class SimpleHumanFactory {
    public static <T extends Human> T createHuman(Class<T> clazz) {
        Human human = null;
        try {
            human = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) human;

    }
}
