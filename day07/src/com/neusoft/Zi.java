package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 14:38
 */

public class Zi extends Fu {
    int num = 6;
    //重写 父类的方法建议使用该注解进行标识
    @Override
    public void show(){
        //想调用父类的成员变量，需要在前面加 super，不加super的话num = 6
        System.out.println("Fu num =" + super.num); //num = 5
        System.out.println("Zi num =" + this.num); // num = 6
    }
}
