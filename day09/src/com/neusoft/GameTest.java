package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/14 15:58
 */

public class GameTest {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("M4A1",1314);
        Armour armour = new Armour("三级甲",666);
        Role role = new Role();
        role.Attack(weapon);
        role.Wear(armour);

    }
}
