package com.neusoft.day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author liuboting
 * @date 2020/7/28 16:08
 */

public class TestForEach {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7};
        for(int i: arr){
            System.out.println(i);
        }

        Collection<String> list = new ArrayList<>();
        list.add("鲁班");
        list.add("后羿");
        list.add("安其拉");
        for(String str: list){
            System.out.println(str);
        }
    }
}
