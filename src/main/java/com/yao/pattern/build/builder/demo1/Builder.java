package com.yao.pattern.build.builder.demo1;

/**
 * @desc 抽象建造者
 * @author yao
 * @date 2024/4/25 11:07
 */
public abstract class Builder {

    // 声明bike变量并初始化
    protected Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();

    public abstract Bike createBike();
}
