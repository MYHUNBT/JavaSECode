package com.neusoft.day13.homework;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/29 18:31
 * 定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
 */

public class CollectionTest05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+"");
        }
        String s = "1";
        System.out.println(listTest(list, s));
    }

    public static boolean listTest(ArrayList<String> a1,String s){
        if(a1.contains(s)){
            return true;
        }else {
            return false;
        }


    }
}
