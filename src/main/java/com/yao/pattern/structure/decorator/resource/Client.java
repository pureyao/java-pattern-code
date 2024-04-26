package com.yao.pattern.structure.decorator.resource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建FileWriter
        FileWriter fw = new FileWriter("/Users/yao/Library/Mobile Documents/com~apple~CloudDocs/pattern/src/main/java/com/yao/pattern/structure/decorator/resource/test.txt");
        // 创建BufferedWriter对象
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello, world!");
        bw.close();
    }
}
