package cn.master.pattern.builder;

import cn.master.pattern.builder.model.CarModel;

/**
 * 建造者模式
 */
public class BuilderTest {

    public static void main(String[] args) {
        CarModel model = Director.getABenzModel();
        model.run();
    }
}
