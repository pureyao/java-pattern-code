package com.yao.pattern.build.factory.abstractFactory;

/**
 * @desc 意大利具体工厂
 * @author yao
 * @date 2024/4/24 22:37
 */
public class ItalyFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
