package com.yao.pattern.behavior.state.after;

/**
 * @desc 抽象状态
 * @author yao
 * @date 2024/6/3 21:28
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
