package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/31 19:18
 */

public class Auto {
    String model;
    int price;
    int carLength;

    public Auto(String model, int price, int carLength) {
        this.model = model;
        this.price = price;
        this.carLength = carLength;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getCarLength() {
        return carLength;
    }

    public void setCarLength(int carLength) {
        this.carLength = carLength;
    }
}
