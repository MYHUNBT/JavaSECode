package com.neusoft.day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liuboting
 * @date 2020/7/29 8:39
 */

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("吕布","貂蝉");
        hashMap.put("孙策","大乔");
        hashMap.put("周瑜","小乔");
        hashMap.put("项羽","虞姬");
        hashMap.put("刘备","孙尚香");
        System.out.println(hashMap);
        boolean b = hashMap.containsKey("吕布");
        System.out.println(b);
//        System.out.println(hashMap);
        boolean b1 = hashMap.containsValue("刘柏廷");
        System.out.println(b1);
        // 返回key值
        String s = hashMap.get("刘备");
        System.out.println(s);
        // remove返回key值
        String s1 = hashMap.remove("刘备");
        System.out.println(s1);
        // 获取所有的键
        Set<String> keySet = hashMap.keySet();
//        System.out.println(keySet);
        for(String key: keySet){
            String val = hashMap.get(key);
            System.out.println(key + "和" + val + "是一对");
        }
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        System.out.println(entries);

        int[] ints = new int[]{1,2,3};
        System.out.println(Arrays.toString(ints));
    }
}
