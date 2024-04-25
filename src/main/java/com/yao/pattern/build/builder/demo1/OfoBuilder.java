package com.yao.pattern.build.builder.demo1;

/**
 * @desc 具体建造者-ofo单车
 * @author yao
 * @date 2024/4/25 11:11
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("ofo车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
