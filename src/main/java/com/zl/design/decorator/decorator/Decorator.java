package com.zl.design.decorator.decorator;

import com.zl.design.decorator.intef.Component;

public class Decorator extends DecoratorComponent {
    public Decorator(Component component) {
        super(component);
    }
    public void operation(){
        decoratorShow();
        super.operation();
    }
    public void decoratorShow(){
        System.out.println("装饰中....");
    }
}
