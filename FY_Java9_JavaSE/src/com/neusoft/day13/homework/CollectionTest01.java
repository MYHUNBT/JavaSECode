package com.neusoft.day13.homework;

import java.util.*;

/**
 * @author liuboting
 * @date 2020/7/29 18:39
 * 给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数，如"a": 2,"b": 2,"c" :1, "xxx":0。
 */

public class CollectionTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        listTest(list);
    }

    public static void listTest(List<String> list){
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(map.containsKey(s)){
                Integer integer = map.get(s) + 1;
                map.put(s,integer);
            }else {
                map.put(s,1);
            }
        }
        Set<String> set = map.keySet();
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(String key:set){
            System.out.println(key + ":" + map.get(key));
        }
//        System.out.println(map);

    }
}
