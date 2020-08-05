package com.neusoft.day14.homework;

import java.util.Objects;

/**
 * @author liuboting
 * @date 2020/7/29 15:46
 *
 */

public class Car {
    private String car;
    private String color;

    public Car(String car, String color) {
        this.car = car;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car1 = (Car) o;
        return Objects.equals(car, car1.car) &&
                Objects.equals(color, car1.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, color);
    }
}
