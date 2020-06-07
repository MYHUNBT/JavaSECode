package com.neusoft;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/5/31 19:22
 */

public class Suv extends Auto{
    public Suv(String model, int price, int carLength) {
        super(model, price, carLength);
    }
    int smallCarLength = 4295;
    int mediumCarLength = 5070;

    public ArrayList<Integer> judge(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if(list1.get(i) <= smallCarLength){
                list1.add(1);
            }else if(list1.get(i) > mediumCarLength){
                list1.add(3);
            }else{
                list1.add(2);
            }
        }
        return list1;
    }

}
