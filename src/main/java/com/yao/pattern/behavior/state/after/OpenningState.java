package com.yao.pattern.behavior.state.after;

/**
 * @desc 开启状态
 * @author yao
 * @date 2024/6/3 21:34
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        // 状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        // 调用当前状态中的context中的close方法
        super.context.close();
    }

    @Override
    public void run() {
        // 什么都不做
    }

    @Override
    public void stop() {
        // 什么都不做
    }
}
