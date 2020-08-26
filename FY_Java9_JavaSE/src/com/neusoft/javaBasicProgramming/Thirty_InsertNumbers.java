package com.neusoft.javaBasicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author liuboting
 * @date 2020/8/20 20:22
 * 题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
 */

public class Thirty_InsertNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        insertNumbers(list,3);
    }
    public static void insertNumbers(ArrayList<Integer> arr,int n){
        if(n>arr.get(arr.size()-1)){
            arr.add(n);
        }else {
            arr.add(0);
        }
        int index = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            if(n <= arr.get(i)){
                index = i;
                break;
            }
        }

        for (int i = arr.size()-1; i > index; i--) {
            arr.set(i,arr.get(i-1));
        }
        arr.set(index,n);
        System.out.println(arr);
    }
}
