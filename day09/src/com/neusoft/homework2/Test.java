package com.neusoft.homework2;

/**
 * @author liuboting
 * @date 2020/6/14 21:12
 */

public class Test {
    public static void main(String[] args) {
        Player player = new Player();
        String select = "法力角色";
        player.select(select);
        System.out.println("选择：" + select);
        FightAble master = new Master();
        master.commonFight();
        master.specialFight();
        System.out.println("=========");
        String select1 = "武力角色";
        player.select(select);
        System.out.println("选择：" + select);
        FightAble warrior = new Warrior();
        warrior.commonFight();
        warrior.specialFight();
    }

}
