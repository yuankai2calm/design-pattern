package cn.master.pattern.builder;

import cn.master.pattern.builder.builder.impl.BenzBuilder;
import cn.master.pattern.builder.model.impl.BenzModel;

import java.util.ArrayList;

/**
 * 建造者模式
 */
public class Director {

    private static ArrayList<String> sequence = new ArrayList<String>();

    public static BenzModel getABenzModel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        return benzModel;

    }
}
