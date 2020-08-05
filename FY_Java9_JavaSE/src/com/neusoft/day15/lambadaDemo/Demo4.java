package com.neusoft.day15.lambadaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author liuboting
 * @date 2020/7/30 16:32
 */

public class Demo4 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("张三",18),
                new Person("李四",12),
                new Person("王五",15),
                new Person("赵六",30)
        };
        Arrays.sort(people,(Person a,Person b)->{
            return a.getAge() - b.getAge();
        });
//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        for(Person person:people){
            System.out.println(person);
        }
    }
}
