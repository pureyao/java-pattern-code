package com.yao.pattern.structure.adapter.resource;

import java.io.InputStreamReader;
import java.io.Reader;

public class Client {
    public static void main(String[] args) {
        // InputStreamReader做了InputStream字节流到Reader字符流的转换，StreamDecoder采用对象适配器模式
        Reader reader = new InputStreamReader(System.in);
    }
}
