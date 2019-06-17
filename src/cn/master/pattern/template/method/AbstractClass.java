package cn.master.pattern.template.method;

public abstract class AbstractClass {
    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 模板方法，调用基本方法，完成相关逻辑
     */
    public void templateMethod() {
        doAnything();

        doSomething();
    }



}
