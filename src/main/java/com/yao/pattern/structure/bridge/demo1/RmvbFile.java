package com.yao.pattern.structure.bridge.demo1;

/**
 * @desc 具体化角色-RMVB文件
 * @author yao
 * @date 2024/4/27 18:58
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb文件" + fileName);
    }
}
