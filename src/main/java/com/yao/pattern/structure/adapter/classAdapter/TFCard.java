package com.yao.pattern.structure.adapter.classAdapter;

/**
 * @desc 适配者接口
 * @author yao
 * @date 2024/4/25 22:13
 */
public interface TFCard {

    String readTF();
    void writeTF(String msg);
}
