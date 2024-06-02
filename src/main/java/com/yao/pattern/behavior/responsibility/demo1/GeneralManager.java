package com.yao.pattern.behavior.responsibility.demo1;

/**
 * @desc 具体处理者-总经理
 * @author yao
 * @date 2024/6/2 15:33
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天,理由:" + leave.getContent() + "，总经理审批同意！");
    }
}
