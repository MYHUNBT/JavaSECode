package com.neusoft.day13.homework;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/29 14:39
 * 定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。()
 */

public class CollectionTest02 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.println(listTest(arr));

    }
    public static ArrayList<Integer> listTest(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        return list;
    }
}
