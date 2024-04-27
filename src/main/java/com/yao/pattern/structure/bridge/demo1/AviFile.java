package com.yao.pattern.structure.bridge.demo1;

/**
 * @desc 具体化角色-AVI文件
 * @author yao
 * @date 2024/4/27 18:58
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi文件" + fileName);
    }
}
