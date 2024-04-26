package com.yao.pattern.structure.adapter.classAdapter;

public class Client {
    public static void main(String[] args) {
        // 使用电脑读取SD卡
        Computer computer = new Computer();
        System.out.println(computer.readSD(new SDCardImpl()));

        // 使用电脑读取TF卡
        // 定义适配器类
        System.out.println(computer.readSD(new SDAdapterTF()));
    }
}
