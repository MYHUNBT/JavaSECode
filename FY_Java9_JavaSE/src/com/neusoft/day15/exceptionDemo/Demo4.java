package com.neusoft.day15.exceptionDemo;

import java.io.FileNotFoundException;

/**
 * @author liuboting
 * @date 2020/7/30 14:13
 */

public class Demo4 {
    public static void main(String[] args) {
        try {
            read("小秘米.text");
        } catch (FileNotFoundException e) {
            // 在try中抛出什么异常，在括号中就捕获什么异常类型
//            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("---------------------------------");
            System.out.println(e);
        }finally {
            System.out.println("不管try和catch执行啥了，我这里都会执行");
        }
        System.out.println("end");

    }
    public static void read(String path) throws FileNotFoundException {
        if(!path.equals("小秘密.text")){
            throw new FileNotFoundException("你的文件怎么消失了");
        }
    }
}
