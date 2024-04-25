package com.yao.pattern.build.singleton.demo2;

/**
 * @desc 饿汉式-静态代码块
 * @author yao
 * @date 2024/4/24 16:14
 */
public class Singleton {

    // 1.私有构造方法
    private Singleton() {}

    // 2.声明Singleton类型变量
    private static Singleton instance; // null

    // 3.静态代码块赋值
    static {
        instance = new Singleton();
    }

    // 4.提供公共访问方式
    public static Singleton getInstance() {
        return instance;
    }
}
