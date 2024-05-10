package com.yao.pattern.structure.combination;

/**
 * @desc 抽象根节点-菜单抽象类
 * @author yao
 * @date 2024/4/28 19:11
 */
public abstract class MenuComponent {
    // 名称
    protected String name;
    // 层级
    protected int level;

    // 添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 获取子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或菜单项的名称
    public String getName() {
        return name;
    }

    // 打印菜单名称的方法（包括子菜单和子菜单项）
    public abstract void print();
}
