package com.yao.pattern.structure.decorator.demo1;

/**
 * @desc 具体装饰角色-培根
 * @author yao
 * @date 2024/4/26 22:31
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(fastFood, 5, "培根");
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
