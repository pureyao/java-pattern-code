package com.yao.pattern.behavior.template.demo1;

/**
 * @desc 测试类
 * @author yao
 * @date 2024/5/19 18:39
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass cook = new ConcretClassBaocai();
        cook.cookProcess();
        System.out.println("================================");
        cook = new ConcretClassCaixin();
        cook.cookProcess();
    }
}
