package com.neusoft.day12;

import java.util.Objects;

/**
 * @author liuboting
 * @date 2020/7/27 14:25
 */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name:" + name + ",age:" + age + "}";
    }
    @Override
    public boolean equals(Object object){
        // 如果对象的地址值一样，则返回true
        if(this == object){
            return true;
        }
        //如果参数为空，或者类型信息不一样，则认为不同
        if(object == null || getClass() != object.getClass())
            return false;

        // 转换当前类型
        Person person = (Person)object;
        // 要求基本类型相等，并且将引用类型交给Objects类的equals静态方法取用结果
        return age == person.age && Objects.equals(this.name,person.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
