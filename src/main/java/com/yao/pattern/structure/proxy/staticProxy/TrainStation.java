package com.yao.pattern.structure.proxy.staticProxy;

/**
 * @desc 真实主题类-火车站
 * @author yao
 * @date 2024/4/25 16:04
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖车票");
    }
}
