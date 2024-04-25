package com.yao.pattern.build.singleton.demo3;

/**
 * @desc 测试类
 * @author yao
 * @date 2024/4/24 16:03
 */
public class Client {
    public static void main(String[] args) {
        // 创建Singleton对象
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1.hashCode() == instance2.hashCode());

    }
}
