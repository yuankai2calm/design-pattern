package cn.master.pattern.proxy.dynamic.impl;

import cn.master.pattern.proxy.dynamic.Subject;

public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("this is RealSubject do something");
    }
}
