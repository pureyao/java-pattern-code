package com.yao.pattern.behavior.state.before;

/**
 * @desc 客户端
 * @author yao
 * @date 2024/6/2 16:23
 */
public class Client {
    public static void main(String[] args) {
        // 创建电梯对象
        Left left = new Left();
        // 设置当前状态
        left.setState(ILeft.RUNNING_STATE);

        // 操作
        left.open();
        left.close();
        left.run();
        left.stop();
    }
}
