package com.yao.pattern.behavior.strategy.demo1;

/**
 * @desc 具体策略类-春节活动A
 * @author yao
 * @date 2024/5/19 20:49
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("春节活动：买一送一");
    }
}
