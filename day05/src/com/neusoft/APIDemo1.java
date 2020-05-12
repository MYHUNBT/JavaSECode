package com.neusoft;

import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/5/10 15:27
 * API: Application Programming Interface 应用程序接口
 */

public class APIDemo1 {
    public static void main(String[] args) {

        // 1. Scanner类(System.in是指通过键盘录入数据)
        // 除了java.lang包下的类不需要导入，其他必须导入才能使用
        //导包格式： import 包名，类名;
        //调用方法 变量名.方法名() + altEnter
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数（求最大值）：");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int max;
        if(n1 >= n2 && n1 >= n3){
            max = n1;
        }else if (n2 >= n3){
            max = n2;
        }else{
            max = n3;
        }
        System.out.println("最大值为：" + max);


//        System.out.println("请输入两个数（求和）：");
//        int number1 = scanner.nextInt();
//        int number2 = scanner.nextInt();
//        int sum = number1 + number2;
//        System.out.println(number1 + "与" + number2 + "的和为" + sum);




        // 2. Random类
        // 3. ArrayList类


    }
}
