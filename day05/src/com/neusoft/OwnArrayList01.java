package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/12 10:47
 */

public class OwnArrayList01 {
    // 定义成员变量
    // data 数组 存储数据
    private int[] data;
    // 集合中有效元素的个数
    private int size;
    // 构造函数， 传入数组的初始容量
    public OwnArrayList01(int capacity){
        data = new int[capacity];
        size = 0;
    }
    // 定义无参构造方法吗默认容量是10
    public OwnArrayList01(){
        this(10);
    }
//    public OwnArrayList01(){
//        data = new int[10];
//        size = 0;
//    }

    // 成员方法
    // 获取数组中元素的个数
    public int getSize(){
        return size;
    }
    // 获取数组的容量
    public int getCapacity(){
        return data.length;
    }
    // 获取数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }
}