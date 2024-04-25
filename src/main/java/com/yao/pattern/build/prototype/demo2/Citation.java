package com.yao.pattern.build.prototype.demo2;

/**
 * @desc 奖状原型类
 * @author yao
 * @date 2024/4/25 10:19
 */
public class Citation implements Cloneable{

    private String name;

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "荣获奖状");
    }
}
