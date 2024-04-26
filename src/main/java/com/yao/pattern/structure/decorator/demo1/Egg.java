package com.yao.pattern.structure.decorator.demo1;

/**
 * @desc 具体装饰角色-鸡蛋
 * @author yao
 * @date 2024/4/26 22:31
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }

}
