package com.neusoft.day13.doudizhu;

import java.util.*;

/**
 * @author liuboting
 * @date 2020/7/28 16:16
 * 斗地主 洗牌和发牌动作
 * 规则：使用54张牌打乱顺序，三个玩家参与游戏，每人17张牌，最后剩三张底牌
 * 1.准备牌：每张牌有花色和数字组成
 * 2.发牌
 * 3.看牌
 * 4.
 */

public class Poker {
    public static void main(String[] args) {
       // 1.准备牌：每张牌有花色和数字组成
        //创建牌盒，储存牌
        List<String> pokerBox = new ArrayList<>();
        //创建花色集合
        List<String> colors = new ArrayList<>();
        //创建数字集合
        List<String> numbers = new ArrayList<>();
        //添加花色
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        //生产牌，拼接花色和数字
        for(String color: colors){
            //每次拿到一种花色
            for(String number: numbers){
                pokerBox.add(color+number);
            }
        }
        pokerBox.add("🃏");
        pokerBox.add("🃏");
//        System.out.println(pokerBox);

        // 洗牌:Collections.shuffle() 随机打乱
        Collections.shuffle(pokerBox);
//        System.out.println(pokerBox);

        Random random = new Random();
        //发牌 创建player1，player2,player3,diPai四个集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            // 判断i值，先判断
            if(i >= 51){
                diPai.add(card);
            }else{
                if(i%3 == 0){
                    player1.add(card);
                }else if (i%3 == 1){
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }
        }

        //看牌
        System.out.println("玩家一的牌：" + player1);
        System.out.println("玩家二的牌：" + player2);
        System.out.println("玩家三的牌：" + player3);
        System.out.println("底牌：" + diPai);
    }
}
