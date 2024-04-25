package com.yao.pattern.structure.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @desc 代理工厂-cglib 拿到的是代理类的子类
 * @author yao
 * @date 2024/4/25 18:10
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();
    public TrainStation getProxyInstance(){
        // 创建enhance对象，类似JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码文件
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式");
        method.invoke(trainStation,objects);
        return null;
    }
}
