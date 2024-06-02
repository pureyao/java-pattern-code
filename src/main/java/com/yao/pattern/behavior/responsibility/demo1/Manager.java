package com.yao.pattern.behavior.responsibility.demo1;

/**
 * @desc 具体处理者-部门经理
 * @author yao
 * @date 2024/6/2 15:33
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天,理由:" + leave.getContent() + "，部门经理审批同意！");
    }
}
