package com.neusoft;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author liuboting
 * @date 2020/5/12 10:55
 * 定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
 */

public class Test04ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }
        System.out.println(list);
// 调用偶数集合的方法
        ArrayList<Integer> arrayList = getArrayList(list);
        System.out.println(arrayList);
    }
    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list){
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                oddList.add(list.get(i));
            }
        }
        return oddList;
    }
}

