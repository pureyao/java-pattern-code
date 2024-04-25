package com.yao.pattern.build.singleton.brokeDemo1;

import java.io.*;

/**
 * @desc 通过序列化破坏单例
 * @author yao
 * @date 2024/4/24 16:03
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 序列化
        write();

        // 反序列化
        read();
    }

    private static void read() throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/youzi/Documents/Repository/pattern/pattern/src/main/java/com/yao/pattern/singleton/brokeDemo1/test.txt"));
        Singleton instance2 = (Singleton) ois.readObject();
        System.out.println(instance == instance2);
    }

    private static void write() throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/youzi/Documents/Repository/pattern/pattern/src/main/java/com/yao/pattern/singleton/brokeDemo1/test.txt"));
        oos.writeObject(instance);
    }
}
