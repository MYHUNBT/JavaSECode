package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 14:30
 */
public class ExtendDemoTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        //为属性赋值
        teacher.name = "小明";
        //调用printName方法
        teacher.printName();  //name:小明
        //调用父类的方法
        teacher.work();  //全心全意地在工作
    }
}


