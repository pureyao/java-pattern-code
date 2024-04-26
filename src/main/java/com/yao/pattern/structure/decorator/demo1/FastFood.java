package com.yao.pattern.structure.decorator.demo1;

/**
 * @desc 抽象构件角色-快餐
 * @author yao
 * @date 2024/4/26 21:48
 */
public abstract class FastFood {

    private float price;
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
