package com.neusoft.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/7/28 14:48
 */

public class TestCollection {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("小鲁班");
        list.add("后羿");
        list.add("安其拉");
        System.out.println(list);
        // contains(E e):判断集合中是否包含给定元素
        boolean b = list.contains("后羿");
        System.out.println(b);

        // remove(E e):把给定的对象元素从集合中删除
        list.remove("小鲁班");
        System.out.println("删除后" + list);

        //isEmpty(): 判断当前集合是否为空
        boolean empty = list.isEmpty();
        System.out.println("是否为空？" + empty);

        //size():返回集合中元素个数
        System.out.println(list.size());

        //集合转数组
        Object[] objects = list.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        list.clear();
        System.out.println(list);
    }
}
