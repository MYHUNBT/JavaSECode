package com.neusoft;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author liuboting
 * @date 2020/5/10 20:41
 */

public class Test02ArrayList {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000);
            list.add(r);
        }
        //调用一个方法，筛选出list里面所有的偶数的新集合
    }
    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list){
        //创建一个小集合，存储偶数
        ArrayList<Integer> smallList = new ArrayList<>();
        //遍历传入list
        for (int i = 0; i < list.size(); i++) {
            //获取每个元素
            if(list.get(i) % 2 == 0){
                list.add(i);
            }
        }
        return smallList;
    }
}
