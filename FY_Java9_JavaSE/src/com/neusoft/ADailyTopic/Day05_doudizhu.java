package com.neusoft.ADailyTopic;
import java.util.ArrayList;
import java.util.Collections;


/**
 * @author liuboting
 * @date 2020/8/4 18:32
 */

public class Day05_doudizhu {
    public static void main(String[] args) {
        ArrayList<String> pokerBox = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for(String number:numbers){
            for(String color:colors){
                pokerBox.add(color + number);
            }
        }

        pokerBox.add("大王");
        pokerBox.add("小王");
        Collections.shuffle(pokerBox);
        System.out.println(pokerBox);
        System.out.println(pokerBox.size());
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            if(i >= 51){
                diPai.add(pokerBox.get(i));
            }else {
                if(i%3 == 0){
                    p1.add(pokerBox.get(i));
                }else if(i%3 ==1){
                    p2.add(pokerBox.get(i));
                }else {
                    p3.add(pokerBox.get(i));
                }
            }
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(diPai);

    }
}
