package com.neusoft;

public class TypeDemo04 {
    /**数据类型转换
     * 如果数据类型不一致，需要进行数据类型转换
     * 1.自动类型转换（隐形转换）：小类型 -> 大类型
     */
    public static void main(String[] args){
//        定义两个int类型的变量a和b, 分别赋值为10, 20.
        int a = 10;
        int b = 20;
//        通过输出语句打印变量a和b的和.
        System.out.println(a + b);
//                定义int类型的变量c, 接收变量a和b的和.
        int c = a+b;
//                打印变量c的值.
        System.out.println(c);
//                定义两个变量aa和bb, 一个是int类型的数据, 另一个是byte类型的数据.
        int aa = 10;
        byte bb = 20;
//                定义变量cc接收 变量aa和bb的和.
//                分别设置变量cc的数据类型为byte类型和int类型, 观察结果并打印.

        int cc1 = aa + bb;
        System.out.println(cc1);

//        byte cc2 = aa + bb;
        // 2、 强制类型转换， 显示转换  大类型--》 小类型
        double d = 30.5;
        // 数据类型 变量名 = （强制转换的类型） 要被转换的数值
        int dd = (int) d;
        System.out.println(dd);
    }
}
