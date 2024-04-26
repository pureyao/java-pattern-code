package com.yao.pattern.structure.adapter.objectAdapter;

/**
 * @desc 目标接口
 * @author yao
 * @date 2024/4/25 22:13
 */
public interface SDCard {

    String readSD();
    void writeSD(String msg);
}
