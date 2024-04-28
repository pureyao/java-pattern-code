package com.yao.pattern.structure.facade;

/**
 * @desc 外观角色-智能软件
 * @author yao
 * @date 2024/4/27 21:36
 */
public class SmartApplicationFacade {

    // 聚合电灯对象、电视对象
    private Light light;
    private Tv tv;

    public SmartApplicationFacade() {
        light = new Light();
        tv = new Tv();
    }

    public void say(String word) {
        if (word.contains("打开")) {
            on();
        } else if (word.contains("关闭")) {
            off();
        } else {
            System.out.println("听不懂");
        }
    }

    private void on() {
        light.on();
        tv.on();
    }

    private void off() {
        light.off();
        tv.off();
    }
}
