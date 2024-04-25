package com.yao.pattern.structure.proxy.jdkProxy;

public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        // 1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2.通过代理工厂获取代理对象
        SellTickets proxyInstance = factory.getProxyInstance();
        // 3.调用卖票方法
        proxyInstance.sell();
    }
}
