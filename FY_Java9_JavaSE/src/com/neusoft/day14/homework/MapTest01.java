package com.neusoft.day14.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liuboting
 * @date 2020/7/29 15:14
 * 请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作
 */

public class MapTest01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // 添加元素
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        System.out.println(map); //{001=张三, 002=李四, 003=王五}

        // 键删除
        String remove = map.remove("001");
        System.out.println(remove);  //张三
        System.out.println(map);   //{002=李四, 003=王五}

        // 根据键获取值操作
        System.out.println(map.get("002")); //李四

        // 判断是否包含某个键或值
        map.containsKey("001");
        map.containsValue("王五");

        // 获取所有键
        Set<String> set = map.keySet();
        for(String s:set){
            String s1 = map.get(s);
            System.out.println(s + "  " +s1);
        }

        //entry
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry: entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "  " + value);
        }
    }
}
