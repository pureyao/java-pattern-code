package com.yao.pattern.structure.flyweight.demo1;

public class Client {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox iBox = boxFactory.getShape("I");
        iBox.display("red");
        AbstractBox lBox = boxFactory.getShape("L");
        lBox.display("blue");
        AbstractBox oBox = boxFactory.getShape("O");
        oBox.display("green");
        AbstractBox oBox2 = boxFactory.getShape("O");
        oBox.display("red");
        System.out.println(oBox == oBox2);
    }
}
