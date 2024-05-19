package com.yao.pattern.behavior.strategy.demo1;

/**
 * @desc 具体策略类-圣诞活动C
 * @author yao
 * @date 2024/5/19 20:49
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("圣诞活动：满100减50");
    }
}
