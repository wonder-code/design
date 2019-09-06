package com.zl.design.adapter.classadapter.service;

import com.zl.design.adapter.classadapter.adapter.Adapter;
import com.zl.design.adapter.classadapter.intef.Target;
import org.junit.Test;

public class Service extends Adapter implements Target {
    public void show() {
        adapterShow();
    }

    @Test
    public  void test() {
        show();
    }
}
