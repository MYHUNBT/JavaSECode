package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/19 20:37
 */
public class ArrayDemo01 {
    /**
     * 数组 定义格式：
     * 1.数组存储的数据类型[] 数组名;
     *  String[] str
     *  2.数据的存储类型 数组名[];
     *  String str2[];
     */
    public static void main(String[] args) {
        //数组的初始化
        //动态初始化：数组只给定长度，系统默认初始值
        //1.数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[长度]
        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);

        //静态初始化
        //数组存储的数据类型[] 数组名 = new 数组存储的类型[]{值1，值2，......}
        int[] arr1 = new int[]{1,2,3};
        //简写形式
        int[] arr2 = {1,2,3};

        //数组的访问
        //数组名[索引]
        System.out.println(arr1[2]);
        //长度属性，数组名.length 表示数组中元素的个数
        System.out.println(arr2.length);
        //修改数组中的元素
        arr[0] = 6;

        //数组遍历，一个个取出来
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
   }
}
