package com.yao.pattern.structure.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc 树枝节点-菜单类
 * @author yao
 * @date 2024/5/10 17:17
 */
public class Menu extends MenuComponent{

    // 聚合菜单
    private List<MenuComponent> menuList = new ArrayList<>();

    // 构造方法
    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuList.get(index);
    }

    @Override
    public void print() {
        // 打印菜单名称
        if (level != 0) {
            for (int i = 0; i < level; i++) {
                System.out.print("--");
            }
        }
        System.out.println(name);
        // 打印子菜单名称或子菜单项名称
        for (MenuComponent menuComponent : menuList) {
            menuComponent.print();
        }
    }
}
