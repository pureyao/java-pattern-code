package com.yao.pattern.build.factory.simpleFactory;

/**
 * @desc 咖啡具体工厂
 * @author yao
 * @date 2024/4/24 22:37
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        }
        else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        return coffee;
    }
}
