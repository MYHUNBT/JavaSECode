package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/19 16:30
 * 打印 2020-1~ 2013-12 之间的所有月份
 */
public class ForForDemo03 {
//    public static void main(String[] args) {
//        //不使用嵌套
//        // xxx年 xx月
//        for(int i =1; i < 12; i++){
//            System.out.println("2020年" + i + "月\t");
//        }
//        for(int i =1; i < 12; i++){
//            System.out.println("2021年" + i + "月\t");
//        }
//        for(int i =1; i < 12; i++){
//            System.out.println("2022年" + i + "月\t");
//        }
//    }
    public static void main(String[] args) {
        //简单写法
        //控制年份
        for(int i = 2020; i <=2023 ; i++){
            //控制月份
            for (int j = 0; j <= 12; j++) {
                System.out.print(i + "年" + j + "月\t");
            }
            System.out.println();
        }
    }
}
