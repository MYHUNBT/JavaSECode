package com.neusoft.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author liuboting
 * @date 2020/7/28 15:09
 */

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("鲁班");
        list.add("后羿");
        list.add("安其拉");
        //遍历
        Iterator<String> iterator = list.iterator();
        //iterator.hasNext()判断是否有迭代元素
        while(iterator.hasNext()){
            //获取迭代的元素
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
