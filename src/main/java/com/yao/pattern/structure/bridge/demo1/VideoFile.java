package com.yao.pattern.structure.bridge.demo1;

/**
 * @desc 实现化角色-媒体文件
 * @author yao
 * @date 2024/4/27 18:54
 */
public interface VideoFile {
    // 解码功能
    void decode(String fileName);
}
