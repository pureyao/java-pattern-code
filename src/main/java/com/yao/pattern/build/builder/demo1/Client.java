package com.yao.pattern.build.builder.demo1;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike bike = director.construct();
        System.out.println(bike.getFrame() + "-" + bike.getSeat());
    }
}
