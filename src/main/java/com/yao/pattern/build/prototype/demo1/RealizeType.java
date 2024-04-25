package com.yao.pattern.build.prototype.demo1;


public class RealizeType implements Cloneable{


    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型创建成功");
        return (RealizeType) super.clone();
    }
}
