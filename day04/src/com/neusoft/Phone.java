package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/26 19:14
 */

public class Phone {
    //属性：品牌，价格，颜色
    String brand;
    int Price;
    String color;
    //方法：打 name 电话，发短信
    public void phone(String name){
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage(){
        System.out.println("发短信");
    }


}
