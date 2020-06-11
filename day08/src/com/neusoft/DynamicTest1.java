package com.neusoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/6/7 16:53
 */

public class DynamicTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(122);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
