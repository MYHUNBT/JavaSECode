package day11.classMember;

/**
 * @author liuboting
 * @date 2020/7/25 11:43
 */

public class Role {
    int id;
    int blood;
    String name;
    //添加武器属性
    Weapon weapon;
    //盔甲
    Armour armour;

    public Role(int id, int blood, String name) {
        this.id = id;
        this.blood = blood;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public void attack(){
        System.out.println("使用" + weapon.getName() + ",造成了" + weapon.getHurt() + "点伤害。");
    }

    public void wear(){
        System.out.println("穿上了" + armour.getName() + ",护甲增加了" + armour.getProtect());
    }
}
