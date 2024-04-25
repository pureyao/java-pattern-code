package com.yao.pattern.build.singleton.demo5;

/**
 * @desc 懒汉式-静态内部类
 * @author yao
 * @date 2024/4/24 16:42
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    // 定义一个静态内部类
    // JVM加载时不会加载内部类，只有调用内部类时才会加载
    private static class SingletonHolder{
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 对外提供方法
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
