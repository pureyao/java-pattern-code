package com.yao.pattern.structure.bridge.demo1;

public class Client {
    public static void main(String[] args) {
        OperatingSystem mac = new Mac(new AviFile());
        mac.play("黑马");
    }
}
