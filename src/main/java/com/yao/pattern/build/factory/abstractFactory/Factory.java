package com.yao.pattern.build.factory.abstractFactory;

/**
 * @desc 抽象工厂
 * @author yao
 * @date 2024/4/24 22:37
 */
public interface Factory {

    Coffee createCoffee();

    Dessert createDessert();

}
