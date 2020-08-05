package com.neusoft.day15.lambadaDemo;

/**
 * @author liuboting
 * @date 2020/7/30 14:37
 */

public class Demo2 {
    public static void main(String[] args) {
//     invoke(() ->{
//         System.out.println("invoke()");
//        });
        Cook c = () ->{
            System.out.println("invoke()");
        };
        c.makeFood();
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
