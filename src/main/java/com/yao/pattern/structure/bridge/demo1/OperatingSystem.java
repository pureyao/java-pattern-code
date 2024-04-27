package com.yao.pattern.structure.bridge.demo1;

/**
 * @desc 抽象化角色-操作系统
 * @author yao
 * @date 2024/4/27 19:00
 */
public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
