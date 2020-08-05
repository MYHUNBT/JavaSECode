package com.neusoft.day14.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Handler;

/**
 * @author liuboting
 * @date 2020/7/29 15:49
 * 请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。
 */

public class MapTest03 {
    public static void main(String[] args) {
        HashMap<Car, Integer> map = new HashMap<>();
        map.put(new Car("car1","红色"),100);
        map.put(new Car("car2","黄色"),101);
        map.put(new Car("car3","绿色"),101);

        Set<Car> set = map.keySet();
        System.out.println("keySet方法遍历");
        for(Car car:set){
            System.out.println(car + "----" + map.get(car));
        }

        Set<Map.Entry<Car,Integer>> entrySet = map.entrySet();
        System.out.println("entrySet方法遍历");
        Iterator<Map.Entry<Car,Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Car,Integer> i = iterator.next();
            System.out.println(i.getKey() + "---" + i.getValue());
        }
    }
}
