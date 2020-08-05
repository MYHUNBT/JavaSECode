package day11.classMember;

/**
 * @author liuboting
 * @date 2020/7/25 13:58
 */

public class Test {
    public static void main(String[] args) {
        Role role1 = new Role(0001, 100, "lbt");
        Weapon weapon = new Weapon("98k", 66);
        Armour armour = new Armour("三级甲", 80);
        role1.setWeapon(weapon);
        role1.setArmour(armour);
        role1.attack();
        role1.wear();
    }
}
