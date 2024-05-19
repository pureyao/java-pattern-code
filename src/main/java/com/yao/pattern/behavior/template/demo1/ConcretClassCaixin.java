package com.yao.pattern.behavior.template.demo1;

/**
 * @desc 具体子类-炒菜心
 * @author yao
 * @date 2024/5/19 18:37
 */
public class ConcretClassCaixin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("放入蒜末");
    }
}
