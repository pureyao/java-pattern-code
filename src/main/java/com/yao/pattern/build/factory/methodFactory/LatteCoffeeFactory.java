package com.yao.pattern.build.factory.methodFactory;

/**
 * @desc 拿铁咖啡具体工厂
 * @author yao
 * @date 2024/4/24 22:37
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
