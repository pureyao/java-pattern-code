package com.yao.pattern.behavior.responsibility.demo1;

/**
 * @desc 抽象处理者类
 * @author yao
 * @date 2024/6/2 15:13
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 该领导处理的请求天数区间
    private final int numStart;
    private final int numEnd;

    // 声明后继者
    private Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 各级审批请假
    protected abstract void handleLeave(LeaveRequest leave);

    // 提交请假条
    public final void submit(LeaveRequest leave) {
        // 该级领导审批
        this.handleLeave(leave);

        if (this.nextHandler != null && leave.getNum() > this.numEnd) {
            this.nextHandler.submit(leave);
        } else {
            System.out.println("流程结束！");
        }

    }
}
