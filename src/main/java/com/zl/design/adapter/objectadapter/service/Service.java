package com.zl.design.adapter.objectadapter.service;

import com.zl.design.adapter.objectadapter.adapter.Adapter;
import com.zl.design.adapter.objectadapter.intef.Target;
import org.junit.Test;

public class Service implements Target {
    private Adapter adapter;
    public Service(Adapter adapter){
        this.adapter = adapter;
    }
    public void show() {
        adapter.adapterShow();
    }
}
