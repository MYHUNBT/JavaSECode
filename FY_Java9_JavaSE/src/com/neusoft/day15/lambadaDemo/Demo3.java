package com.neusoft.day15.lambadaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author liuboting
 * @date 2020/7/30 15:02
 */

public class Demo3 {
    public static void main(String[] args) {
        Person[] people = {
            new Person("张三",18),
            new Person("李四",12),
            new Person("王五",15),
            new Person("赵六",30)
        };
        Comparator<Person> comp = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        int[] i = {1,2,3};
        Arrays.sort(i);
        Arrays.sort(people,comp);
        System.out.println(Arrays.toString(people));
    }
}
