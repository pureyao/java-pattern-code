package com.yao.pattern.build.factory.simpleFactory;

/**
 * @desc 单例咖啡馆
 * @author yao
 * @date 2024/4/24 22:12
 */
public class CoffeeStore {

    private CoffeeStore(){}

    private static CoffeeStore instance = new CoffeeStore();

    public static CoffeeStore getInstance() {
        return instance;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
