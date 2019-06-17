package cn.master.pattern.builder.builder.impl;

import cn.master.pattern.builder.builder.CarBuilder;
import cn.master.pattern.builder.model.CarModel;
import cn.master.pattern.builder.model.impl.BenzModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

    BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(ArrayList sequence) {
        benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }
}
