package com.neusoft.homework1;

/**
 * @author liuboting
 * @date 2020/6/14 15:32
 */

public class Armour {
    private String name; //防具名
    private int protect; //防具值

    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
