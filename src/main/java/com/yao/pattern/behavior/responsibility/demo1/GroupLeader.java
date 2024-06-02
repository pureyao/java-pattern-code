package com.yao.pattern.behavior.responsibility.demo1;

/**
 * @desc 具体处理者-小组长
 * @author yao
 * @date 2024/6/2 15:33
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天,理由:" + leave.getContent() + "，小组长审批同意！");
    }
}
