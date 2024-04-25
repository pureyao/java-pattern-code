package com.yao.pattern.build.factory.abstractFactory;

/**
 * @desc 测试类
 * @author yao
 * @date 2024/4/24 22:19
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Factory factory = new ItalyFactory();
        coffeeStore.setFactory(factory);

        Coffee coffee = coffeeStore.orderCoffee();
        Dessert dessert = coffeeStore.orderDessert();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());
    }
}
