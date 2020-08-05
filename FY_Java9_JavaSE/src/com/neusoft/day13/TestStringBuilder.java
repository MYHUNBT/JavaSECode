package com.neusoft.day13;

/**
 * @author liuboting
 * @date 2020/7/28 11:14
 */

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = builder.append("hello");
        System.out.println("builder=" + builder);
        System.out.println("builder1=" + builder1);
        System.out.println(builder == builder1);

        builder.append("放大发");
        builder.append(1000);
        builder.append(true);
        /*在我们开发中，会遇到调用一个方法后，返回一个对象的情况，然后使用返回的对象继续调用方法
        * 着种我们可以使用链式编程的方式
        * */
        builder.append("haha").append("哈哈").append(true).append(123);
    }
}
