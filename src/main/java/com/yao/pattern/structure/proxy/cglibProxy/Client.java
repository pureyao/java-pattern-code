package com.yao.pattern.structure.proxy.cglibProxy;

public class Client {
    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 获取代理对象
        TrainStation proxyInstance = proxyFactory.getProxyInstance();
        // 调用代理对象的sell方法
        proxyInstance.sell();
    }
}
