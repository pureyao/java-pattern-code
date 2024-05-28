package com.yao.pattern.behavior.command.demo1;

/**
 * @desc 客户端
 * @author yao
 * @date 2024/5/28 22:52
 */
public class Client {

    public static void main(String[] args) {

        // 订单1号
        Order order1= new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面",1);
        order1.setFood("红烧肉",1);

        // 订单2号
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("鱼香肉丝",1);
        order2.setFood("西红柿鸡蛋面",5);

        SeniorChef seniorChef = new SeniorChef();
        Waiter waiter = new Waiter();

        OrderCommand cmd1 = new OrderCommand(seniorChef,order1);
        OrderCommand cmd2 = new OrderCommand(seniorChef,order2);

        waiter.setCommand(cmd1);
        waiter.setCommand(cmd2);
        waiter.orderUp();
    }
}
