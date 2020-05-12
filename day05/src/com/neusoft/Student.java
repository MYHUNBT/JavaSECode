package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/10 14:07
 * 构造方法
 * 面向对象：属性，方法 （c/python中的函数function）
 * 当对象被创建的时候， 构造方法用来初始化该对象，给对象的成员变量赋初始值
 * 构造方法的格式：
 * 修饰符  构造方法名（参数列表）{方法体}
 * 写法上，1、方法名与他所在类的名字相同 2、没有返回值，所以不需要指定返回类型，也不需要void
 * 小贴士：无论你是否定义了构造方法, 所有类都有构造方法，因为Java自动为你提供了一个无参构造方法，
 * 一旦你自己定义了构造方法，Java自动提供的默认的无参构造方法就会失效
 */

public class Student {

    private String name;
    private int age;

    // 无参构造方法
    public Student(){
//        System.out.println("无参构造方法被调用");
    }

    //有参的构造方法，初始化学生类的时候
    public Student(String name,int age){
        this.age = age;
        this.name = name;
        System.out.println("有参构造方法被调用" + this.name);
    }

    // 1、如果你不提供构造方法，系统会默认给你一个无参构造方法
    // 2、如果你提供了构造方法，系统不会给你提供一个无参构造方法
    // 3、构造方法时可以重载的， 既可以定义参数，也可以不定义参数

}
