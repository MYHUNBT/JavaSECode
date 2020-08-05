package com.neusoft.day14.MapversionDoudizhu;

import java.util.*;

/**
 * @author liuboting
 * @date 2020/7/29 20:00
 */

public class Poker2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♣","♠");
        Collections.addAll(numbers,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
        int count = 1;

        for(String number:numbers){
            for(String color:colors){
                map.put(count++,color+number);
            }
        }
        map.put(count++,"大王");
        map.put(count++,"小王");
//        System.out.println(map);
        Set<Integer> keySet = map.keySet();
        List<Integer> list = new ArrayList<>();
        list.addAll(keySet);
        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> noP1 = new ArrayList<>(); //noP1 = {1,2,5,7}
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> noDiPai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer index = list.get(i);
            if(i >= 51){
                noDiPai.add(index);
            }else if(i % 3 == 0){
                noP1.add(index);
            }else if(i % 3 == 1){
                noP2.add(index);
            }else {
                noP3.add(index);
            }
        }

        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(noDiPai);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for(Integer i :noP1){
            p1.add(map.get(i));
        }
        for(Integer i :noP2){
            p2.add(map.get(i));
        }
        for(Integer i :noP3){
            p3.add(map.get(i));
        }
        for(Integer i :noDiPai){
            diPai.add(map.get(i));
        }

        System.out.println("玩家一：" + p1);
        System.out.println("玩家二：" + p2);
        System.out.println("玩家三：" + p3);
        System.out.println("底牌：" + diPai);

    }
}
