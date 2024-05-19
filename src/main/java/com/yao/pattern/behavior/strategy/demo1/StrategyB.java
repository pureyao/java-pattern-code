package com.yao.pattern.behavior.strategy.demo1;

/**
 * @desc 具体策略类-中秋活动B
 * @author yao
 * @date 2024/5/19 20:49
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("中秋活动：满100减20");
    }
}
