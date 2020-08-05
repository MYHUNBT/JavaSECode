package com.neusoft.day13.homework;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/7/29 18:27
 * 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
 * 并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
 */

public class CollectionTest04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

    }
}
