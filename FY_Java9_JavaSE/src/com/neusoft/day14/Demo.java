package com.neusoft.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liuboting
 * @date 2020/7/29 8:41
 */

public class Demo {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("iphone","8");
        hashMap.put("vivo","X20");
        hashMap.put("HUAWEI","P40");
        hashMap.put("小米","8");
        System.out.println(hashMap);

        String s1 = hashMap.get("vivo");
        System.out.println("vivo型号:" + s1);

        boolean b1 = hashMap.containsKey("小米");
        System.out.println("是否有小米手机？" + b1);

        boolean b2 = hashMap.containsValue("X20");
        System.out.println("是否有X20型号的手机？" + b2);

        Set<String> strings = hashMap.keySet();
        System.out.println("所有的键" + strings);

        String s3  = hashMap.remove("小米");
        System.out.println(s3);

        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        for(Map.Entry<String,String> entry: entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
