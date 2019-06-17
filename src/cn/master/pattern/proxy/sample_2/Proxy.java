package cn.master.pattern.proxy.sample_2;

public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();

        subject.request();

        after();
    }


    public void before() {
        System.out.println(" before method invoked ......");
    }

    public void after() {
        System.out.println(" after method invoked ......");
    }
}
