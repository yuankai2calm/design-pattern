package cn.master.pattern.singleton;

/**
 * 单例模式
 */
public class City {
    private static volatile City instance;

    private City() {

    }

    /**
     * 双重检验锁单例
     * @return
     */
    public static City getInstance() {
        if(instance == null) {
            synchronized (City.class) {
                if(instance == null) {
                    instance = new City();
                }
            }
        }
        return instance;
    }

}
