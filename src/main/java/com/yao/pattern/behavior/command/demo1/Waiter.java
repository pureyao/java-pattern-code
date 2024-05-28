package com.yao.pattern.behavior.command.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc 请求者-服务员类
 * @author yao
 * @date 2024/5/28 22:48
 */
public class Waiter {

    // 持有多个命令对象
    List<Command> commandList = new ArrayList<>();

    public void setCommand(Command command) {
        commandList.add(command);
    }

    // 发起命令
    public void orderUp() {
        System.out.println("服务员：点餐完毕，请服务员上菜");
        for (Command command : commandList) {
            command.execute();
        }
    }
}
