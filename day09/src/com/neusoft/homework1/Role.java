package com.neusoft.homework1;



/**
 * @author liuboting
 * @date 2020/6/14 15:28
 */

public class Role {
    private int id; //角色id
    private  int blood; // 角色血量
    private  String name; // 角色名

    //添加武器属性
    private Weapon wp;

    //添加盔甲属性
    private Armour ar;

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

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }

    public void Attack(){
        System.out.println("使用" + wp.getName() + "，造成了" + wp.getHurt() + "点伤害");
    }
    public void Wear(){
        System.out.println("穿上了" + ar.getName() + "，增加了" + ar.getProtect() + "点生命值");
    }
}
