package com.neusoft;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/5/12 10:52定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用,分隔每个元素。格式参照 {元素
 * ,元素,元素}
 */

public class Test03ArrayList {
    public static void main(String[] args) {
// 创建集合对象
        ArrayList<String> list = new ArrayList<String>();
// 添加字符串到集合中
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("殷梨亭");

//  调用方法

        printArrayList(list);

    }

    public  static  void  printArrayList(ArrayList<String>  list)  {

//  拼接左括号
        System.out.print("{");
//  遍历集合
        for  (int  i  =  0;  i  <  list.size();  i++)  {
//  获取元素
            String  s  =  list.get(i);
//  拼接@符号
            if  (i  !=  list.size() - 1)  {
                System.out.print(s  +  ",");
            }  else  {
//  拼接右括号
                System.out.print(s  +  "}");
            }
        }
    }
}