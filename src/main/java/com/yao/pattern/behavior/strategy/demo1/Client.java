package com.yao.pattern.behavior.strategy.demo1;

/**
 * @desc 客户端
 * @author yao
 * @date 2024/5/19 20:54
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
