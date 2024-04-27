package com.yao.pattern.structure.bridge.demo1;

/**
 * @desc 扩展抽象角色-windows操作系统
 * @author yao
 * @date 2024/4/27 20:36
 */
public class Windows extends OperatingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
