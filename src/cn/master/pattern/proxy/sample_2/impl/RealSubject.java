package cn.master.pattern.proxy.sample_2.impl;

import cn.master.pattern.proxy.sample_2.Subject;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println(" this is real subject request");
    }
}
