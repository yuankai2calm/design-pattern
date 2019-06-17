package cn.master.pattern.builder.model.impl;

import cn.master.pattern.builder.model.CarModel;

public class BmwModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Bmw start......");
    }

    @Override
    protected void stop() {
        System.out.println("Bmw stop......");

    }

    @Override
    protected void alarm() {
        System.out.println("Bmw alarm......");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Bmw engineBoom......");
    }
}
