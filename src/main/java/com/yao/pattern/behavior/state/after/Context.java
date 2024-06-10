package com.yao.pattern.behavior.state.after;

/**
 * @desc 上下文
 * @author yao
 * @date 2024/6/3 21:31
 */
public class Context {

    // 定义四个常量对应四个状态
    public final static LiftState OPENING_STATE = new OpenningState();
    public final static LiftState CLOSING_STATE = new ClosingState();
    public final static LiftState RUNNING_STATE = new RunningState();
    public final static LiftState STOPPING_STATE = new StoppingState();

    // 电梯当前状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
