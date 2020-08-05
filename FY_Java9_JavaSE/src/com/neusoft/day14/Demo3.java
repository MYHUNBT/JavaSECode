package com.neusoft.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liuboting
 * @date 2020/7/29 9:23
 */

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("吕布","貂蝉");
        hashMap.put("孙策","大乔");
        hashMap.put("周瑜","小乔");
        hashMap.put("项羽","虞姬");
        hashMap.put("刘备","孙尚香");
        // 获取所有的entry对象
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        // 遍历
        for(Map.Entry<String, String> entry:entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
