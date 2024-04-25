package com.yao.pattern.build.builder.demo1;

/**
 * @desc 指挥者类
 * @author yao
 * @date 2024/4/25 11:14
 */
public class Director {

    // 声明builder变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车功能
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
