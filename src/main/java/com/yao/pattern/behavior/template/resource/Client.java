package com.yao.pattern.behavior.template.resource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @desc InputStream使用模板方法模式
 * @author yao
 * @date 2024/5/19 18:48
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // read(byte b[], int off, int len) 是模板方法，read()抽象调用子类read()方法
        InputStream inputStream = Files.newInputStream(Paths.get(""));
    }
}
