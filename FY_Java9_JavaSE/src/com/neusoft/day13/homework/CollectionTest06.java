package com.neusoft.day13.homework;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/29 18:36
 * 定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。
 */

public class CollectionTest06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(listTest(list));
    }

    public static boolean listTest(ArrayList<String> a1){
        if(!a1.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
