package com.yao.pattern.build.singleton.demo4;

/**
 * @desc 懒汉式-双重检查锁
 * @author yao
 * @date 2024/4/24 16:32
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    // 声明对象
    private static volatile Singleton instance;

    // 对外提供方法
    public static Singleton getInstance() {
        // 第一次判断
        if (instance == null) {
            synchronized (Singleton.class){
                // 第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
