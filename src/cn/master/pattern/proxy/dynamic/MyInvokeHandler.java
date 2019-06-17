package cn.master.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理增强类
 * 在这里进行增强逻辑
 */
public class MyInvokeHandler implements InvocationHandler {
    private Subject subject = null;
    public MyInvokeHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //执行被代理的方法
        System.out.println("被代理的方法名称: " + method.getName());
        Object result = method.invoke(subject, args);//proxy是代理类对象， subject是被代理类对象
        return result;
    }
}
