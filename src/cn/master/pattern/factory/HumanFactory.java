package cn.master.pattern.factory;

import cn.master.pattern.factory.model.Human;

/**
 * 工厂模式
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
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
