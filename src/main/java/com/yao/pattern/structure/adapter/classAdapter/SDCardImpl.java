package com.yao.pattern.structure.adapter.classAdapter;

/**
 * @desc 目标类
 * @author yao
 * @date 2024/4/25 22:14
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SD card read success";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD card write success:" + msg);
    }
}
