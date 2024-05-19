package com.yao.pattern.behavior.strategy.source;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @desc Comparator使用类策略模式
 * @author yao
 * @date 2024/5/19 21:05
 */
public class Client {
    public static void main(String[] args) {
        Integer[] data = {1,3,12,5,2,4,7,9,6};
        Arrays.sort(data, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("结束");
    }
}
