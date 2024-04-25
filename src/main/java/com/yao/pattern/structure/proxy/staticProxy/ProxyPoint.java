package com.yao.pattern.structure.proxy.staticProxy;

/**
 * @desc 代理类-代售点
 * @author yao
 * @date 2024/4/25 16:04
 */
public class ProxyPoint implements SellTickets{

    // 声明火车站对象
    private final TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代售点代卖车票");
        trainStation.sell();
    }
}
