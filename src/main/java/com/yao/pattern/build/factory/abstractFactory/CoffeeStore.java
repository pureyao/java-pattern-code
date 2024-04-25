package com.yao.pattern.build.factory.abstractFactory;

/**
 * @desc 单例咖啡馆
 * @author yao
 * @date 2024/4/24 22:12
 */
public class CoffeeStore {

    private Factory factory;

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }

    public Dessert orderDessert() {
        return factory.createDessert();
    }
}
