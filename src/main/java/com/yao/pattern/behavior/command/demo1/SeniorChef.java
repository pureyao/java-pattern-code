package com.yao.pattern.behavior.command.demo1;

/**
 * @desc 接收者-厨师类
 * @author yao
 * @date 2024/5/28 21:48
 */
public class SeniorChef {

    // 制作食物
    public void cookFood(String name,int num){
        System.out.println("食物" + name + "制作了" + num + "份");
    }
}
