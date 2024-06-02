package com.yao.pattern.behavior.responsibility.demo1;

/**
 * @desc 请假条类
 * @author yao
 * @date 2024/6/2 15:10
 */
public class LeaveRequest {

    //姓名
    private String name;
    //请假天数
    private int num;
    //请假原因
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }

}
