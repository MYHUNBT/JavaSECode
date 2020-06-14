package com.neusoft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuboting
 * @date 2020/6/14 18:36
 */

public class DoubleNumberTest {
    public static void main(String[] args) {
        // 创建一个样本数据
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        //调用获取所有偶数的方法
        List<Integer> evenNum = getEvenNum(arrayList);
        System.out.println(evenNum);
    }
    // 获取某集合中所有的偶数
    // 此时List<Integer>  list作为了getEvenNum（）的方法参数
    public static List<Integer> getEvenNum(List<Integer> list){
        List<Integer> arrayList = new ArrayList<>();
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if(integer%2 == 0){
                arrayList.add(integer);
            }
        }
        // 因为 getEvenNum方法返回值类型是List<Integer>，
        // arrayList 是List的子类， 所以arrayList是可以返回的
        // 接口对应的类型作为返回值类型
        return arrayList;
    }
}
