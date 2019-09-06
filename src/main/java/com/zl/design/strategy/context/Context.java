package com.zl.design.strategy.context;

import com.zl.design.strategy.intef.Strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void showMethod(){
        strategy.strategyMethod();
    }
}
