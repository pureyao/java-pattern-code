package com.yao.pattern.structure.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @desc 获取代理对象的工厂
 * @author yao
 * @date 2024/4/25 16:42
 */
public class ProxyFactory {

    // 声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyInstance() {
        // 返回代理对象
        /**
         * ClassLoader loader 类加载器，用于加载代理类，可以通过目标对象获取类加载器
         * Class<\?> interfaces 代理类实现接口的字节码文件
         * InvocationHandler h 代理对象的调用处理程序
         * */
        return (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * proxy 代理对象，在invoke方法中基本不用
                     * method 目标对象的方法
                     * args 方法的参数
                     * */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 增强
                        System.out.println("代理点收取一些服务费用(JDK代理)");

                        // 代理原方法
                        return method.invoke(station, args);
                    }
                }
        );
    }
}
