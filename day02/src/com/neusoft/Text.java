package com.neusoft;

public class Text {

    public static void main(String[] args){
        int a = 20;
        System.out.println(a);
        {
            //大括号包裹起来的代码叫做代码块
            //作用：让变量尽可能早的从内存消失，节约资源
            //高级编程语言的时候. GC 垃圾回收机制
            double b = 22.22;
            System.out.println(b);

        }
        /**此行代码会报错变量b 已经从内存消失，无法访问
         * System.out.println(b);
         */
        /**变量可以一行声明多行
         *java:int e = 10,f = 20 ,g = 30;
         *python:a,b,c = 10,20,30
         */
    }
}
