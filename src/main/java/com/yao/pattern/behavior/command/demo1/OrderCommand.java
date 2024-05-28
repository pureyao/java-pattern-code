package com.yao.pattern.behavior.command.demo1;

import java.util.Map;

/**
 * @desc 具体命令类- 点餐命令
 * @author yao
 * @date 2024/5/28 22:43
 */
public class OrderCommand implements Command {

    // 持有接收者对象
    private SeniorChef seniorChef;
    private Order order;

    // 有参构造方法
    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (String foodName : foodDir.keySet()) {
            seniorChef.cookFood(foodName, foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable() + "桌的订单准备完毕！！！");
    }
}
