package com.neusoft;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/5/31 18:11
 */

public class Manager extends User{
    public Manager(){

    }
    public Manager(String name, int money){
        super(name, money);
    }
    //定义发红包
    public ArrayList<Integer> send(int totalMoney, int count){
        int lastRedBag = 0;
        ArrayList<Integer> list = new ArrayList<>();
        //查看群主有多少钱，余额不足要告诉一下
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("您的余额不足");
            return list;
        }
        //扣钱
        super.setMoney(this.getMoney() - totalMoney);
        //发红包将红包分成count份
        int oneRedBag = totalMoney/count;
        //如果除不开，将零头放到最后一个红包里
        if(totalMoney % count != 0){
            lastRedBag = totalMoney - (count - 1) * oneRedBag;
        }else{
            lastRedBag = oneRedBag;
        }
        //将余额一个一个放到集合中

        for (int i = 0; i < count; i++) {
            if(i != count-1){
                list.add((int)oneRedBag);
            }else{
                list.add(lastRedBag);
            }
        }
        //
        return list;
    }
}
