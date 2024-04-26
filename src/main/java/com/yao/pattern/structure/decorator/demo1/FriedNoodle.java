package com.yao.pattern.structure.decorator.demo1;

/**
 * @desc 具体构件角色-炒面
 * @author yao
 * @date 2024/4/26 21:52
 */
public class FriedNoodle extends FastFood{

    // 给无参构造默认参数
    public FriedNoodle() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
