package com.yao.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc 具体主题类
 * @author yao
 * @date 2024/8/3 23:26
 */
public class SubscriptionSubject implements Subject {

    // 定义一个集合，存储抽象观察者集合
    private List<Observer> weixinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        // 遍历集合 通知所有观察者
        for (Observer observer : weixinUserList) {
            observer.update(message);
        }
    }
}
