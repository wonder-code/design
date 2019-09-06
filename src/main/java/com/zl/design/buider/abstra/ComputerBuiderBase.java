package com.zl.design.buider.abstra;

import com.zl.design.buider.pojo.Computer;

/**
 * 建造者模式
 */
public abstract class ComputerBuiderBase {
    protected Computer computer = new Computer();
    public abstract void buildCpu();
    public abstract void buildXianka();
    public abstract void buildNeicun();
    public Computer getComputer(){
        return computer;
    }
}
