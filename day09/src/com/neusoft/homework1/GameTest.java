package com.neusoft.homework1;

import com.neusoft.homework1.Armour;
import com.neusoft.homework1.Role;
import com.neusoft.homework1.Weapon;

/**
 * @author liuboting
 * @date 2020/6/14 15:58
 */

public class GameTest {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("M4A1",1314);
        Armour armour = new Armour("三级甲",666);
        Role role = new Role();
        role.setWp(weapon);
        role.setAr(armour);
        role.Attack();
        role.Wear();
    }
}
