package com.yao.pattern.build.singleton.resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @desc Runtime类使用单例饿汉式
 * @author yao
 * @date 2024/4/24 17:52
 */
public class RuntimeTest {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process exec = runtime.exec("echo 123");
        InputStream is = exec.getInputStream();
        byte[] arr = new byte[1024 * 1024];
        int len = is.read(arr);
        System.out.println(new String(arr,0,len,"GBK"));
    }
}
