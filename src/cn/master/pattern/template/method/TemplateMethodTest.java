package cn.master.pattern.template.method;

import cn.master.pattern.template.method.impl.ConcreteFirst;
import cn.master.pattern.template.method.impl.ConcreteSecond;

/**
 * 模板方法设计模式
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        ConcreteFirst concreteFirst = new ConcreteFirst();
        ConcreteSecond concreteSecond = new ConcreteSecond();

        concreteFirst.templateMethod();

        concreteSecond.templateMethod();
    }
}
