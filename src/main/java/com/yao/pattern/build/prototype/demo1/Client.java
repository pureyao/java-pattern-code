package com.yao.pattern.build.prototype.demo1;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType realizeType1 = realizeType.clone();
        System.out.println(realizeType == realizeType1);
    }
}
