package com.yao.pattern.behavior.state.after;

/**
 * @desc 停止状态
 * @author yao
 * @date 2024/6/3 21:47
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }
    @Override
    public void close() {
        //do nothing
    }
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }
    @Override
    public void stop() {
        System.out.println("电梯停止...");
    }
}
