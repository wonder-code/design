package com.zl.design.decorator.abstra;

import com.zl.design.decorator.intef.Component;

public class ConcreteComponent implements Component {
    public void operation() {
        System.out.println("具体角色操作...");
    }
}
