package com.yao.pattern.structure.decorator.demo1;

/**
 * @desc 抽象装饰角色
 * @author yao
 * @date 2024/4/26 22:16
 */
public abstract class Garnish extends FastFood{

    // 声明抽象构件变量
    private FastFood fastFood;


    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
