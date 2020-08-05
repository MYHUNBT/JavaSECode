package com.neusoft.day16;

/**
 * @author liuboting
 * @date 2020/7/31 14:48
 */

public abstract class Shape {
    private double area;
    private double per;
    private String color;
    public Shape(){

    }
    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPer();

    public abstract void showAll();
}
