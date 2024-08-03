package com.yao.pattern.behavior.state.after;

/**
 * @desc 启动状态
 * @author yao
 * @date 2024/6/3 21:48
 */
public class RunningState extends LiftState {

    public void open()
    {
        //do nothing
    }

    public void close()
    {
        //do nothing
    }

    public void run()
    {
        System.out.println("电梯运行...");
    }

    public void stop()
    {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
