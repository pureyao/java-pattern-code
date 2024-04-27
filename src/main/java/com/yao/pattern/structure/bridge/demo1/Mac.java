package com.yao.pattern.structure.bridge.demo1;

/**
 * @desc 扩展抽象角色-mac操作系统
 * @author yao
 * @date 2024/4/27 20:36
 */
public class Mac extends OperatingSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
