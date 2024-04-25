package com.yao.pattern.build.factory.simpleFactory;

/**
 * @desc 测试类
 * @author yao
 * @date 2024/4/24 22:19
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = CoffeeStore.getInstance();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
