package com.yao.pattern.structure.facade;

/**
 * @desc 子系统电灯
 * @author yao
 * @date 2024/4/27 21:34
 */
public class Light {

    // 开灯
    public void on() {
        System.out.println("开灯");
    }

    // 关灯
    public void off() {
        System.out.println("关灯");
    }
}
