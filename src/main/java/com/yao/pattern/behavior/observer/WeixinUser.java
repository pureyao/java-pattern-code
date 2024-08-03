package com.yao.pattern.behavior.observer;

/**
 * @desc 具体观察者类
 * @author yao
 * @date 2024/8/3 23:33
 */
public class WeixinUser implements Observer{

    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到消息：" + message);
    }
}
