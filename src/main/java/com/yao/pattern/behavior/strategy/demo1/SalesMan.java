package com.yao.pattern.behavior.strategy.demo1;

/**
 * @desc 环境类-促销员
 * @author yao
 * @date 2024/5/19 20:52
 */
public class SalesMan {

    // 聚合策略类
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    // 促销员展示活动
    public void salesManShow() {
        strategy.show();
    }
}
