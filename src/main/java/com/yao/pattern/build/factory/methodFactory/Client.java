package com.yao.pattern.build.factory.methodFactory;

/**
 * @desc 测试类
 * @author yao
 * @date 2024/4/24 22:19
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory factory = new LatteCoffeeFactory();
        coffeeStore.setFactory(factory);

        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
