package com.yao.pattern.structure.combination;

public class Client {
    public static void main(String[] args) {
        // 创建菜单树
        MenuComponent menu = new Menu("咖啡厅", 1);
        MenuComponent menu1 = new Menu("咖啡", 2);
        MenuComponent menu2 = new Menu("茶", 2);
        MenuComponent menu3 = new Menu("甜点", 2);
        MenuComponent menu4 = new Menu("咖啡", 3);
        MenuComponent menu5 = new Menu("茶", 3);
        MenuComponent menu6 = new Menu("甜点", 3);
        MenuComponent menu7 =new MenuItem("美式咖啡", 4);
        MenuComponent menu8 =new MenuItem("拿铁咖啡", 4);
        MenuComponent menu9 =new MenuItem("抹茶", 4);
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        menu1.add(menu4);
        menu2.add(menu5);
        menu3.add(menu6);
        menu4.add(menu7);
        menu4.add(menu8);
        menu5.add(menu9);
        menu.print();
    }
}
