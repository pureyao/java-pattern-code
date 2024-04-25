package com.yao.pattern.build.singleton.brokeDemo1;

import java.io.Serializable;

/**
 * @desc 饿汉式-静态成员变量
 * @author yao
 * @date 2024/4/24 15:59
 */
public class Singleton implements Serializable {

    // 1.私有构造方法
    private Singleton() {}

    // 2.在本类中创建该类对象
    private static Singleton instance = new Singleton();

    // 3.提供公共访问方式
    public static Singleton getInstance() {
        return instance;
    }

    // 防止序列化破坏单例
    // 当调用反序列化时自动调用该方法并返回返回值
    public Object readResolve() {
        return instance;
    }
}
