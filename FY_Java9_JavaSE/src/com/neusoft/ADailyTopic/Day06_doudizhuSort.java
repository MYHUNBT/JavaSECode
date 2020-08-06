package com.neusoft.ADailyTopic;

import java.util.*;

/**
 * @author liuboting
 * @date 2020/8/5 13:40
 */

public class Day06_doudizhuSort {
    public static void main(String[] args) {
        HashMap<Integer,String> pokerBox = new HashMap<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> pokers = new ArrayList<>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for (int i = 3; i <= 10; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        numbers.add("2");
        int i = 0;
        for(String number:numbers){
            for(String color:colors){
                pokerBox.put(++i,color + number);
            }
        }
        pokerBox.put(++i,"大王");
        pokerBox.put(++i,"小王");
        System.out.println(pokerBox);

        ArrayList<Integer> poker = new ArrayList<>();
        poker.addAll(pokerBox.keySet());
        Collections.shuffle(poker);
        System.out.println(poker.size());

        ArrayList<Integer> p1no = new ArrayList<>();
        ArrayList<Integer> p2no = new ArrayList<>();
        ArrayList<Integer> p3no = new ArrayList<>();
        ArrayList<Integer> diPaino = new ArrayList<>();
        for (int j = 0; j < 54; j++) {
            if(j >= 51){
                diPaino.add(poker.get(j));
            }else {
                if(j % 3 == 0){
                    p1no.add(poker.get(j));
                }else if (j % 3 == 1){
                    p2no.add(poker.get(j));
                }else {
                    p3no.add(poker.get(j));
                }
            }
        }

        Collections.sort(p1no);
        Collections.sort(p2no);
        Collections.sort(p3no);
        Collections.sort(diPaino);

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int j = 0; j < p1no.size(); j++) {
            p1.add(pokerBox.get(p1no.get(j)));
            p2.add(pokerBox.get(p2no.get(j)));
            p3.add(pokerBox.get(p3no.get(j)));

        }
        for(Integer number:diPaino){
            diPai.add(pokerBox.get(number));
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(diPai);
    }
}
