package com.yao.pattern.behavior.responsibility.demo1;

/**
 * @desc 客户端
 * @author yao
 * @date 2024/6/2 15:40
 */
public class Client {
    public static void main(String[] args) {

        // 创建请假条
        LeaveRequest leave = new LeaveRequest("张三", 5, "事假");

        // 创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        // 设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 提交请假申请
        groupLeader.submit(leave);
    }
}
