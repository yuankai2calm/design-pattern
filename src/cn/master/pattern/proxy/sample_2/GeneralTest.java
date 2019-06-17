package cn.master.pattern.proxy.sample_2;

import cn.master.pattern.proxy.sample_2.impl.RealSubject;

/**
 * 代理类通用方法
 */
public class GeneralTest {

    public static void main(String[] args) {

        Proxy proxy = new Proxy(new RealSubject());

        proxy.request();

    }

}
