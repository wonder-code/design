package com.zl.design.decorator.decorator;

import com.zl.design.decorator.intef.Component;

public class DecoratorComponent implements Component {
    private Component component;
    public DecoratorComponent(Component component){
        this.component = component;
    }
    public void operation(){
        component.operation();
    }
}
