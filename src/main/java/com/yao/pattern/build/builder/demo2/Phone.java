package com.yao.pattern.build.builder.demo2;

/**
 * @desc 手机类
 * @author yao
 * @date 2024/4/25 11:31
 */
public class Phone {

    private String name;
    private String mem;
    private int sort;

    // 私有构造方法
    private Phone(Builder builder){
        this.name = builder.name;
        this.mem = builder.mem;
        this.sort = builder.sort;
    }

    public void show() {
        System.out.println(this.name + "-" + this.mem + "-" + this.sort);
    }

    public static final class Builder{
        private String name;
        private String mem;
        private int sort;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder mem(String mem){
            this.mem = mem;
            return this;
        }

        public Builder sort(int sort){
            this.sort = sort;
            return this;
        }

        // 使用建造者创建Phone对象
        public Phone build() {
            return new Phone(this);
        }
    }

}
