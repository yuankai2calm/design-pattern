package cn.master.pattern.template.method.impl;

import cn.master.pattern.template.method.AbstractClass;

public class ConcreteSecond extends AbstractClass {
    @Override
    protected void doAnything() {
        System.out.println("ConcreteSecond doAnything......");
    }

    @Override
    protected void doSomething() {
        System.out.println("ConcreteSecond doSomething......");
    }
}
