package com.neusoft.day13.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * @author liuboting
 * @date 2020/7/29 19:45
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */

public class CollectionTest07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(listTest(list, 1));
    }

    public static Integer listTest(ArrayList<Integer> a1,Integer s){
        Iterator<Integer> set = a1.iterator();
        int index = -1;
        while (set.hasNext()){
            index++;
            Integer next = set.next();
            if(next == s){
                return index;
            }
        }
        return -1;
    }
}
