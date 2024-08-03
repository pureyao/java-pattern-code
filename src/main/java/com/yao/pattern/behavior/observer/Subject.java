package com.yao.pattern.behavior.observer;

/**
 * @desc 抽象主题类
 * @author yao
 * @date 2024/8/3 23:21
 */
public interface Subject {

    // 增加订阅者
    void attach(Observer observer);

    // 删除订阅者
    void detach(Observer observer);

    // 通知订阅者更新消息
    void notify(String message);
}
