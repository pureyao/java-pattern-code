package com.yao.pattern.structure.flyweight.resource;

/**
 * @desc 包装类缓存机制
 * @author yao
 * @date 2024/5/10 23:05
 */
public class Client {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        // 127后的转化会创建新对象
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
    }
}
