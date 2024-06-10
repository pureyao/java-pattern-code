package com.yao.pattern.behavior.state.before;

/**
 * @desc 电梯接口
 * @author yao
 * @date 2024/6/2 16:14
 */
public interface ILeft {

    // 定义电梯状态常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    // 设置状态
    void setState(int state);

    // 电梯操作
    void open();
    void close();
    void run();
    void stop();
}
