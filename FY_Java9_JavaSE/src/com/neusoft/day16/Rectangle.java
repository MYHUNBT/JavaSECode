package com.neusoft.day16;

/**
 * @author liuboting
 * @date 2020/7/31 14:58
 */

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(int width,int height,String color){
        super(color);
        this.height = height;
        this.width = width;
    }
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return (width + height)*2;
    }

    @Override
    public void showAll() {
        System.out.println("面积：" + this.getArea() + ",周长:" + this.getPer());
    }
}
