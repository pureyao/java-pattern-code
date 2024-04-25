package com.yao.pattern.build.factory.abstractFactory;

/**
 * @desc 美式具体工厂
 * @author yao
 * @date 2024/4/24 22:37
 */
public class AmericanFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
