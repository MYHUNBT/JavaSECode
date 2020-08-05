package com.neusoft.day15.myGeneric;

/**
 * @author liuboting
 * @date 2020/7/30 9:08
 */

public class TestGenericDemo {
    public static void main(String[] args) {
        // 创建一个泛型为String类
        MyGenericClass<String> genericClass = new MyGenericClass<>();
        genericClass.setMvp("登");
        String mvp = genericClass.getMvp();
        System.out.println(mvp);

        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(3);
        Integer mvp1 = my2.getMvp();
        System.out.println(mvp1);
    }
}
