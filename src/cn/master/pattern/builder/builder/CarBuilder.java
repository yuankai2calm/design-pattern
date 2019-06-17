package cn.master.pattern.builder.builder;

import cn.master.pattern.builder.model.CarModel;

import java.util.ArrayList;

/**
 * 构建model的建造者
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList sequence);

    public abstract CarModel getCarModel();

}
