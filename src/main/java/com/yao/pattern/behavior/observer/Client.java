package com.yao.pattern.behavior.observer;

/**
 * @desc 客户端类
 * @author yao
 * @date 2024/8/3 23:35
 */
public class Client {
    public static void main(String[] args) {
        // 主题
        Subject subject = new SubscriptionSubject();

        // 订阅者
        subject.attach(new WeixinUser("孙悟空"));
        subject.attach(new WeixinUser("猪八戒"));
        subject.attach(new WeixinUser("沙悟净"));

        subject.notify("更新文章啦！！！");
    }
}
