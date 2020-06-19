package com.neusoft.homework5;

/**
 * @author liuboting
 * @date 2020/6/18 18:37
 */

public class Apple {
    private int size;
    private String color;

    public Apple() {
    }

    public Apple(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.size + "-" + this.color;
    }
}
