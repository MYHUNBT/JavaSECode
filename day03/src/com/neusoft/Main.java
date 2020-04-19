package com.neusoft;
/*
* break跳出本次循环
* continue用来结束本次循环，进行下一次循环
* */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("start");
        //定义10次循环
        for(int i=1; i <= 10; i++){
            //判断 i=6 结束循环
            if(i==6)
                break;
            System.out.println("hello world" + i);
        }
        System.out.println("end");

    }
}
