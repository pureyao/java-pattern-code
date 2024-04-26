package com.yao.pattern.structure.decorator.demo1;

/**
 * @desc 具体构件角色-炒饭
 * @author yao
 * @date 2024/4/26 21:52
 */
public class FriedRice extends FastFood{

    // 给无参构造默认参数
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
