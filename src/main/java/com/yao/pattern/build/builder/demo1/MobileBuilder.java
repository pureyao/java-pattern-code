package com.yao.pattern.build.builder.demo1;

/**
 * @desc 具体建造者-摩拜单车
 * @author yao
 * @date 2024/4/25 11:11
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
