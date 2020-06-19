package com.neusoft.homework2;

/**
 * @author liuboting
 * @date 2020/6/14 20:59
 */

public interface FightAble {
    void specialFight();
    default void commonFight(){
        System.out.println("普通打击");
    }
}
