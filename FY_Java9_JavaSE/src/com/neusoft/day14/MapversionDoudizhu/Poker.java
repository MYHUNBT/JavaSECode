package com.neusoft.day14.MapversionDoudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author liuboting
 * @date 2020/7/29 11:31
 */

public class Poker {
    public static void main(String[] args) {
        // 创建map 集合
        HashMap<Integer, String> pokerMap = new HashMap<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♣","♠");
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
        int count = 1;
        pokerMap.put(count++,"大王");
        pokerMap.put(count++,"小王");
        // 初始化其他牌
        for(String color:colors){
            for(String number:numbers){
                String card = color + number;
                pokerMap.put(count++,card);
            }
        }
        System.out.println(pokerMap);
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
        System.out.println(numberList);
        //创建玩家和底牌编号集合
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        // 不发牌，发编号
        for (int i = 0; i < numberList.size(); i++) {
            Integer integer = numberList.get(i);
            if(i >= 51){
                diPai.add(integer);
            }else if(i%3 == 0){
                noP1.add(integer);
            }

        }

        Collections.sort(noP1);
        Collections.sort(noP1);
        Collections.sort(noP1);
        Collections.sort(noP1);

    }
}
