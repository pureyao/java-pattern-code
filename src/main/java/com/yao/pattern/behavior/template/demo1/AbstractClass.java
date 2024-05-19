package com.yao.pattern.behavior.template.demo1;

/**
 * @desc 抽象类（定义模板方法和基本方法）
 * @author yao
 * @date 2024/5/19 18:26
 */
public abstract class AbstractClass {

    // 模板方法
    public final void cookProcess() {
        // 倒油
        this.pourOil();

        // 热油
        this.heatOil();

        // 倒蔬菜
        this.pourVegetable();

        // 倒调味料
        this.pourSauce();

        // 翻炒
        this.stirFry();
    }

    // 基本方法
    // 倒油
    public void pourOil() {
        System.out.println("倒油");
    }

    // 热油
    public void heatOil() {
        System.out.println("热油");
    }

    // 倒蔬菜
    public abstract void pourVegetable();

    // 倒调味料
    public abstract void pourSauce();

    // 翻炒
    public void stirFry() {
        System.out.println("翻炒");
    }

}
