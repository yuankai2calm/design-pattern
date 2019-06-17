package cn.master.pattern.proxy.dynamic;

import cn.master.pattern.proxy.dynamic.impl.RealSubject;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */

public class DynamicProxyTest {

    public static void main(String[] args) {
        Subject subject = new RealSubject();

        MyInvokeHandler invokeHandler = new MyInvokeHandler(subject);

        Subject subjectProxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), invokeHandler);
        subjectProxy.doSomething();

    }
}
