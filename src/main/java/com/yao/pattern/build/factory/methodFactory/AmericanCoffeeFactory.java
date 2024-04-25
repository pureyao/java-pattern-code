package com.yao.pattern.build.factory.methodFactory;

/**
 * @desc 美式咖啡具体工厂
 * @author yao
 * @date 2024/4/24 22:37
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
