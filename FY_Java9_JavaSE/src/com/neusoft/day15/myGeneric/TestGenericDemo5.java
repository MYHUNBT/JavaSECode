package com.neusoft.day15.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author liuboting
 * @date 2020/7/30 9:59
 */

public class TestGenericDemo5 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();
        getElement1(list1);
//        getElement1(list2); //报错
        getElement1(list3);
//        getElement1(list4); //报错

//        getElement2(list1); //报错
//        getElement2(list2); //报错
        getElement2(list3);
        getElement2(list4);
    }
    // 泛型的上限，此时泛型？必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> collection){
        // <?> 代表可以接受任意类型
    }
    // 泛型的下限，此时泛型？必须是Number类型或者Number类型的子父类
    public static void getElement2(Collection<? super Number> collection){
        // <?> 代表可以接受任意类型
    }
}
