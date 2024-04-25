package com.yao.pattern.build.singleton.brokeDemo2;

import java.io.Serializable;

/**
 * @desc 饿汉式-静态成员变量
 * @author yao
 * @date 2024/4/24 15:59
 */
public class Singleton implements Serializable {

    // 1.私有构造方法
    private Singleton() {
        synchronized (Singleton.class) {
            // 防止反射调用无参构造破坏单例
            if (instance == null) {
                throw new RuntimeException("单例对象，无法重复创建");
            }
        }
    }

    // 2.在本类中创建该类对象
    private static Singleton instance = new Singleton();

    // 3.提供公共访问方式
    public static Singleton getInstance() {
        return instance;
    }
}
