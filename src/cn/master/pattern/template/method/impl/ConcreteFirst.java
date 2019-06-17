package cn.master.pattern.template.method.impl;

import cn.master.pattern.template.method.AbstractClass;

public class ConcreteFirst extends AbstractClass {
    @Override
    protected void doAnything() {
        System.out.println("ConcreteFirst doAnything......");
    }

    @Override
    protected void doSomething() {
        System.out.println("ConcreteFirst doSomething......");
    }
}
