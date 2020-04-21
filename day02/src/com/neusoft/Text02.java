package com.neusoft;

import java.util.Scanner;
// alt + enter 快速导包
// ctrl + y 删除光标所在行
// ctrl + d 复制粘贴光标所在行
// ctrl + alt +l 代码格式化



public class Text02 {
//        System.out.println("请输入小明的成绩：");
//        Scanner scanner = new Scanner(System.in);
//        int record = (int)scanner.nextDouble();
//        if(record>100 || record<0){
//            System.out.println("成绩不正确，请重新输入成绩");
//        }else{
//            if(record>=95 && record<=100){
//                System.out.println("奖励小明山地自行车一辆");
//            }else if(record>=90 && record<=94){
//                System.out.println("奖励小明游乐场玩一次");
//            }else if(record>=80 && record<=89){
//                System.out.println("奖励小明变形金刚玩具一个");
//            }else{
//                System.out.println("胖揍小明");
//            }
//        }
//        switch(record/10){
//            case 10:
//            case 9:
//                System.out.println("奖励小明山地自行车一辆");
//                break;
//            case 8:
//                System.out.println("奖励小明游乐场玩一次");
//                break;
//            case 7:
//                System.out.println("奖励小明变形金刚玩具一个");
//                break;
//            case 6:
//            case 5:
//            case 4:
//            case 3:
//            case 2:
//            case 1:
//            case 0:
//                System.out.println("胖揍小明");
//                break;
//            default:
//                System.out.println("成绩不正确，请重新输入成绩");
//                break;

    public static void main(String[] args) {
        System.out.println("请输入员工工龄：");
        Scanner scanner = new Scanner(System.in);
        int a = (int) scanner.nextDouble();
        int wages = 0;
        if(a>=10&&a<15) {
            wages = 5000;
        }else if(a>=5&&a<10) {
            wages = 2500;
        }else if(a>=3&&a<5) {
            wages = 1000;
        }else if(a>=1&&a<3) {
            wages = 500;
        }else if(a>=0&&a<1) {
            wages = 200;
        }else{
            System.out.println("输出错误");
        }
        System.out.println("您工作了" + a +"年"+ "," + "基本工资为3000元" + "," + "应涨工资" + wages +
                "," + "涨后工资" + (wages+3000));
    }

}


