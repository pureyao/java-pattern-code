package com.yao.pattern.structure.adapter.classAdapter;

/**
 * @desc 适配器类
 * @author yao
 * @date 2024/4/25 22:23
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
