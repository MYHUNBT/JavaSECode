package com.neusoft.day15.myGeneric;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/30 9:38
 */

public class TestGenericDemo3 {
    public static void main(String[] args) {
        MyGenericImpl2<String> mi = new MyGenericImpl2<>();
        ArrayList<String> list = new ArrayList<>();
        mi.add("hahaha");
    }
}
