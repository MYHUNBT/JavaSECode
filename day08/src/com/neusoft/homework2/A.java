package com.neusoft.homework2;

public interface A {
    abstract void showA();
    private static void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
        }
    }

    static void showB10(){
        System.out.println("static AAAA");
        show10("AAAA");
    }

    static void showC10(){
        System.out.println("static CCCC");
        show10("CCCC");
    }

}
