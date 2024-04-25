package com.yao.pattern.build.singleton.demo3;

/**
 * @desc 懒汉式-方式一
 * @author yao
 * @date 2024/4/24 16:20
 */
public class Singleton {

    // 1.私有构造方法
    private Singleton() {}

    // 2.声明Singleton类型变量
    private static Singleton instance;

    // 3.提供公共访问方式
    public static synchronized Singleton getInstance() {
        // 判断instance是否为null
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
