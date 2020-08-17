package com.neusoft.javaBasicProgramming;

import java.util.*;

/**
 * @author liuboting
 * @date 2020/8/10 18:37
 * 题目：两个乒乓球队进行比赛，各出三人。
 * 甲队为a,b,c三人，乙队为x,y,z三人。
 * 已抽签决定比赛名单。有人向队员打听比赛的名单。
 * a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 */

public class Eighteen_TableTennisMatch {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"x","y","z");
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).equals("x") && !list.get(i).equals("z")){
                map.put("c",list.remove(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).equals("x")){
                map.put("a",list.remove(i));
            }
        }
        map.put("b",list.get(0));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry);
        }
    }
}
