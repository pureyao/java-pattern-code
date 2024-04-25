package com.yao.pattern.build.factory.methodFactory;

/**
 * @desc 咖啡抽象类
 * @author yao
 * @date 2024/4/24 22:04
 */
public abstract class Coffee {

    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
