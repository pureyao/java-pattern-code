package com.yao.pattern.structure.flyweight.demo1;

import java.util.HashMap;

/**
 * @desc 享元工厂
 * @author yao
 * @date 2024/5/10 22:46
 */
public class BoxFactory {
    private HashMap<String,AbstractBox> map;
    private static BoxFactory factory = new BoxFactory();

    // 构造方法初始化
    private BoxFactory() {
        map = new HashMap<>();
        map.put("L",new LBox());
        map.put("I",new IBox());
        map.put("O",new OBox());
    }

    // 获取对象的方法
    public static BoxFactory getInstance() {
        return factory;
    }

    // 根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
