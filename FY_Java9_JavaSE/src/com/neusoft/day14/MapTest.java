package com.neusoft.day14;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author liuboting
 * @date 2020/7/29 10:59
 */

public class MapTest {
    public static void main(String[] args) {
        // nidnau32nfdh4 统计上面字符串每个字符出现的次数
        System.out.println("请输入字符：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            map.put(c,0);
//        }
//        System.out.println(map);
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            Integer integer = map.get(c) + 1;
//            map.put(c,integer);
//        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                Integer integer = map.get(c) + 1;
                map.put(c,integer);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
