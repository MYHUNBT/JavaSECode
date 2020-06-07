package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/7 18:15
 */

public class DynamicTest2 {
    public static void main(String[] args) {
        // 向上转型
        Animal cat = new Cat();
//        cat.eat();
        // 向下转型
        //  格式： 子类类型 对象名 = （子类类型）new 父类对象
//        Cat cat1 = new Cat();
//        cat1.eat();
        // 转型的异常， .ClassCastException
        Dog dog = (Dog) cat;
        dog.eat();
        // instance of 判断对象属于某种类型

//        if (cat instanceof Animal){
//            Cat c = (Cat) cat;
//            c.eat();
//        }else{
//            System.out.println("不是父类的类型不能强制转换");
//        }

//        Cat jiaFei = new JiaFei();
//        if (jiaFei instanceof Cat){
//            JiaFei fei = (JiaFei) jiaFei;
//            fei.eat();
//        }else {
//            System.out.println("不是父类的类型不能强制转换");
//        }


    }
}