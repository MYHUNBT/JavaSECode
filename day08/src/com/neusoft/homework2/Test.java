package com.neusoft.homework2;

/**
 * @author liuboting
 * @date 2020/6/7 20:13
 */

public class Test extends B implements A{
    public static void main(String[] args) {
        A.showB10();
        A.showC10();
        B b = new B();
        b.showA();
        b.showD();
    }
}
