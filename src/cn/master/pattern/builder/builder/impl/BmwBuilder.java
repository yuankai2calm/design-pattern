package cn.master.pattern.builder.builder.impl;

import cn.master.pattern.builder.builder.CarBuilder;
import cn.master.pattern.builder.model.CarModel;
import cn.master.pattern.builder.model.impl.BmwModel;

import java.util.ArrayList;

public class BmwBuilder extends CarBuilder {
    BmwModel bmwModel = new BmwModel();
    @Override
    public void setSequence(ArrayList sequence) {
        bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}
