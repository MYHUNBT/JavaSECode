package com.neusoft.homework2;

/**
 * @author liuboting
 * @date 2020/6/14 21:02
 */

public class Player {
    public FightAble select(String str){
        if("法力角色".equals(str)){
            return new Master();
        }else if ("武力角色".equals(str)){
            return new Warrior();
        }
        return null;
    }
}
