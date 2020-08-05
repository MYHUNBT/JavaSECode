package com.neusoft.day13.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/7/28 16:57
 */

public class Poker2 {
    public static void main(String[] args) {
        List<String> pokerBox = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♣");
        colors.add("♠");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        for(String color: colors){
            for(String number: numbers){
                pokerBox.add(color+number);
            }
        }

        pokerBox.add("大王");
        pokerBox.add("小王");
        Collections.shuffle(pokerBox);

        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> diPai = new ArrayList<>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if(i >= 51){
                diPai.add(card);
            }else {
                if(i % 3 == 0){
                    player1.add(card);
                }else if(i % 3 ==1){
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }
        }
        System.out.println("玩家一：" + player1);
        System.out.println("玩家二：" + player2);
        System.out.println("玩家三：" + player3);
        System.out.println("底牌：" + diPai);
    }
}
