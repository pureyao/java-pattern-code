package com.yao.pattern.structure.adapter.objectAdapter;

/**
 * @desc 适配器类
 * @author yao
 * @date 2024/4/25 22:23
 */
public class SDAdapterTF implements SDCard {

    // 声明适配者类
    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
