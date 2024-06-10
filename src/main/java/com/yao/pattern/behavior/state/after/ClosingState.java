package com.yao.pattern.behavior.state.after;

/**
 * @desc 关闭状态
 * @author yao
 * @date 2024/6/3 21:41
 */
public class ClosingState extends LiftState{
    public void open()
    {
        //状态修改
        super.context.setLiftState(Context.OPENING_STATE);
        //动作委托
        super.context.getLiftState().open();
    }
    public void close()
    {
        System.out.println("电梯门关闭...");
    }
    public void run()
    {
        //状态修改
        super.context.setLiftState(Context.RUNNING_STATE);
        //动作委托
        super.context.getLiftState().run();
    }
    public void stop()
    {
        //状态修改
        super.context.setLiftState(Context.STOPPING_STATE);
        //动作委托
        super.context.getLiftState().stop();
    }
}
