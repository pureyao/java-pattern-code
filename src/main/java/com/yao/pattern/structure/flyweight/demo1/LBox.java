package com.yao.pattern.structure.flyweight.demo1;

/**
 * @desc 具体享元角色
 * @author yao
 * @date 2024/5/10 22:43
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L型";
    }
}
