package com.neusoft.javaBasicProgramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/8/8 14:19
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
 */

public class Eleven_NoRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        String line = scanner.nextLine();
        String[] s = line.replaceAll(" ",",").split(",");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(Integer.parseInt(s[i]));
        }
        showNoRepeat(list);
    }
    public static void showNoRepeat(ArrayList<Integer> arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                for (int k = 0; k < arr.size(); k++) {
                    sum = arr.get(i)*100 + arr.get(j)*10 + arr.get(k);
                    if(i != j && i != k && j != k && map.get(sum) == null){
                        map.put(count++,sum);
                    }
                }
            }
        }
        Collection<Integer> values = map.values();
        System.out.println("一共能组成" + values.size() + "个互不相同且无重复数字的三位数");
        System.out.println(values);
    }
}
