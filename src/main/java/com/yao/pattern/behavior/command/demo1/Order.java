package com.yao.pattern.behavior.command.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc 订单类
 * @author yao
 * @date 2024/5/22 23:00
 */
public class Order {

    // 餐桌编号
    private int diningTable;

    // 所下的餐品和份数
    private Map<String,Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,int num) {
        foodDir.put(name,num);
    }

}