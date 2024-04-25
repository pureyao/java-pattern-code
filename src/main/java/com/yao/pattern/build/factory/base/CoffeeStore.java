package com.yao.pattern.build.factory.base;

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
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
