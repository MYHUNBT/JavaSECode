package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/26 19:16
 */

public class Test02_Phone {
    public static void main(String[] args) {
        //创建对象
        Phone phone = new Phone();
        //输出成员变量
        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.Price);
        //成员变量赋值
        phone.brand = "小米";
        phone.color = "黄色";
        phone.Price = 3888;
        //再次输出
        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.Price);
        //调用打电话方法
        phone.phone("刘柏廷");
        //调用发短信方法
        phone.sendMessage();
        show(phone);
    }
      public static void show(Phone p){
          System.out.println(p.brand + p.color + p.Price);
      }
}
