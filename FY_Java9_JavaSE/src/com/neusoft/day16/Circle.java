package com.neusoft.day16;

import java.nio.channels.Pipe;

/**
 * @author liuboting
 * @date 2020/7/31 15:03
 */

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public double getPer() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void showAll() {
        System.out.println("面积：" + this.getArea() + ",周长:" + this.getPer());
    }
}
