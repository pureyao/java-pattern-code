package com.yao.pattern.structure.combination;

/**
 * @desc 叶子节点-菜单项类
 * @author yao
 * @date 2024/5/10 21:37
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        if (level != 0) {
            for (int i = 0; i < level; i++) {
                System.out.print("--");
            }
        }
        System.out.println(name);
    }
}
