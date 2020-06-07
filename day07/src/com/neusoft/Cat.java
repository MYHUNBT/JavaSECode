package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 16:15
 */

public class Cat extends Animal{
    private String name;
    //无参构造函数
    Cat(){
        super();
        System.out.println("Cat()");
    }
    Cat(String name){
        // super();子类中每个均右super()，用来调用父类空参构造
        //手动调用父类的super()，会覆盖默认的super()
        //super()和this()都必须在构造方法的第一行
        super();
        //调用本来的构造方法
        // this()
        this.name = name;
        System.out.println("Cat" + name);
    }
    @Override
    public void eat(){
        System.out.println("cat:eat");
    }
    public void eatTest(){
        this.eat(); // this 调用本类的方法
        super.eat();
    }
}
