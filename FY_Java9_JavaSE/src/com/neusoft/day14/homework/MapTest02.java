package com.neusoft.day14.homework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author liuboting
 * @date 2020/7/29 15:33
 * 往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value
 */

public class MapTest02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");

        Collection<String> values = map.values();
        System.out.println(values);

        for(String value:values){
            System.out.println(value);
        }
        System.out.println("-----------");
        Iterator<String> iterator = values.iterator();
//        String next = iterator.next();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
