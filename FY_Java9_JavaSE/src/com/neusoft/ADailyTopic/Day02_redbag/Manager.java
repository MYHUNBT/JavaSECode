package com.neusoft.ADailyTopic.Day02_redbag;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/31 8:34
 */

public class Manager extends User {
    public Manager(String userName, int leftMoney) {
        super(userName, leftMoney);
    }
    public ArrayList<Integer> sendRedBag(int totalMoney,int count){
        ArrayList<Integer> list = new ArrayList<>();
        if(super.getLeftMoney() < totalMoney){
            System.out.println("余额不足，请充值");
            return list;
        }
        super.setLeftMoney(super.getLeftMoney() - totalMoney);
        int avg = totalMoney/count;
        for (int i = 0; i < count; i++) {
            if(i == count-1){
                list.add(totalMoney - avg*(count - 1));
            }else{
                list.add(avg);
            }
        }
        return list;
    }
}
