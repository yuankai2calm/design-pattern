package cn.master.pattern.factory;

import cn.master.pattern.factory.model.Human;

public abstract class AbstractHumanFactory {

    /**
     * 显示了范围类型和传入参数类型是Human接口的实现类
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> clazz);
}
