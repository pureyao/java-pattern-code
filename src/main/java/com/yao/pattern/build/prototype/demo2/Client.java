package com.yao.pattern.build.prototype.demo2;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation prototype = new Citation();

        Citation xiaowang = prototype.clone();
        xiaowang.setName("小王");
        Citation xiaoli = prototype.clone();
        xiaoli.setName("小李");
        Citation xiaozhang = prototype.clone();
        xiaozhang.setName("小张  ");

        xiaowang.show();
        xiaoli.show();
        xiaozhang.show();
    }
}
