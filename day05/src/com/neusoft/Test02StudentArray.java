package com.neusoft;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/5/10 19:21
 */

public class Test02StudentArray {
    public static void main(String[] args) {
        /**
         *  new ArrayList<Student>(); // <E>表示一种指定的数据类型,叫做泛型
         *  new ArrayList<String>(); // <E>表示一种指定的数据类型,叫做泛型
         *  new ArrayList<Integer>(); // <E>表示一种指定的数据类型,叫做泛型
         */

        // 使用ArrayList jdk 1.7之前
        // ArrayList<String> list = new ArrayList<String>();
        // 使用ArrayList jdk 1.7之后
        ArrayList<StudentJavaBean> list = new ArrayList<>();
        // 指定元素添加到集合的尾部
        // list.add("张三");
        // 创建刘、关、张、赵 四位同学的信息
        StudentJavaBean s1 = new StudentJavaBean("刘玄德", 50);
        StudentJavaBean s2 = new StudentJavaBean("关云长", 45);
        StudentJavaBean s3 = new StudentJavaBean("张翼德", 42);
        StudentJavaBean s4 = new StudentJavaBean("赵子龙", 41);


        // 进行添加操作
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // 打印list
        System.out.println(list);

        System.out.println(list.size());

        // 遍历ArrayLisy的第一种方式fori 循环
        for (int i = 0; i <list.size() ; i++) {
//            StudentJavaBean s = list.get(i);
//            System.out.println(s.getName());
            System.out.println(list.get(i).getName());
        }




    }
}