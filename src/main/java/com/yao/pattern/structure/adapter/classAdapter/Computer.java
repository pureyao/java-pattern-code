package com.yao.pattern.structure.adapter.classAdapter;

/**
 * @desc 电脑
 * @author yao
 * @date 2024/4/25 22:18
 */
public class Computer {

    // 从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sdCard is null");
        }
        return sdCard.readSD();
    }
}
