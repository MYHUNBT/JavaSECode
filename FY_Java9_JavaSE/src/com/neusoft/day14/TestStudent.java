package com.neusoft.day14;

import java.util.HashMap;

/**
 * @author liuboting
 * @date 2020/7/29 10:34
 */

public class TestStudent {
    public static void main(String[] args) {
        //创建map
        HashMap<Student, String> map = new HashMap<>();
        //添加元素
        map.put(new Student("张三",18),"锦州");
        map.put(new Student("李四",19),"葫芦岛");
        map.put(new Student("王五",20),"大连");
        map.put(new Student("赵六",21),"营口");

        for(Student key:map.keySet()){
            String val = map.get(key);
            System.out.println(key + "  " + val);
        }
    }
}
