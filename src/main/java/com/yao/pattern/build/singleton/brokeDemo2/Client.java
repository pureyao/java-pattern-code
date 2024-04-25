package com.yao.pattern.build.singleton.brokeDemo2;

import java.lang.reflect.Constructor;

/**
 * @desc 通过反射 破坏单例
 * @author yao
 * @date 2024/4/24 16:03
 */
public class Client {
    public static void main(String[] args) throws Exception {

        // 1.获取字节码对象
        Class cla = Singleton.class;

        // 2.获取无参构造对象
        Constructor declaredConstructor = cla.getDeclaredConstructor();

        // 3.取消访问检查
        declaredConstructor.setAccessible(true);

        // 4.创建新对象
        Singleton instance1 = (Singleton) declaredConstructor.newInstance();
        Singleton instance2 = (Singleton) declaredConstructor.newInstance();

        System.out.println(instance1 == instance2);
    }
}
