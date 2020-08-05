package com.neusoft.day15.myGeneric;

/**
 * @author liuboting
 * @date 2020/7/30 9:21
 */

public class TestGenericDemo2 {
    public static void main(String[] args) {
        MyGenericMethod method = new MyGenericMethod();
        // 在调用方法时，确定泛型的类型
        method.show("aaa"); // class java.lang.String
        method.show(12); // class java.lang.Integer
        method.show(12.34); //class java.lang.Double
        System.out.println(method.show2("123"));
    }
}
