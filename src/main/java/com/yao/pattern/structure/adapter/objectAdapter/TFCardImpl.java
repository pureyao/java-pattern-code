package com.yao.pattern.structure.adapter.objectAdapter;

/**
 * @desc 适配者类
 * @author yao
 * @date 2024/4/25 22:14
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TF card read success";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF card write success:" + msg);
    }
}
