package com.yao.pattern.behavior.state.before;

/**
 * @desc 电梯类
 * @author yao
 * @date 2024/6/2 16:16
 */
public class Left implements ILeft{

    // 声明一个电梯当前状态的变量
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
            case RUNNING_STATE:
                // 什么都不做
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯门开启");
                setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("电梯门关闭");
                setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                // 什么都不做
                break;
            case CLOSING_STATE:
            case STOPPING_STATE:
                // 什么都不做
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE:
                // 什么都不做
                break;
            case RUNNING_STATE:
                // 什么都不做
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止");
                setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行");
                setState(RUNNING_STATE);
                break;
            }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE:
                // 什么都不做
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止");
                setState(STOPPING_STATE);
                break;
            case CLOSING_STATE:
                // 什么都不做
                break;
            case STOPPING_STATE:
                // 什么都不做
                break;
        }
    }
}
