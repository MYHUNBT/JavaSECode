package com.neusoft.day14.homework;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author liuboting
 * @date 2020/7/29 16:21
 * 有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
 * 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 */

public class MapTest05 {
    public static void main(String[] args) {
        String[] s1 = new String[]{"黑龙江省","浙江省","江西省","广东省","福建省"};
        System.out.println(Arrays.toString(s1));
        String[] s2 = new String[]{"哈尔滨","杭州","南昌","广州","福州"};
        System.out.println(Arrays.toString(s2));
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            String key = s1[i];
            String value = s2[i];
            map.put(key,value);
        }
        System.out.println(map);
    }
}
