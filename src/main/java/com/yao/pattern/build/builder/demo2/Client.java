package com.yao.pattern.build.builder.demo2;

public class Client {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder().append("123");

        // 通过建造者获取手机对象
        Phone phone = new Phone.Builder().name("华为").mem("12GB").build();
        phone.show();
    }
}
