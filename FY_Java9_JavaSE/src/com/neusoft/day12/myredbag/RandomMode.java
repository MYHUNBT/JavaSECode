package com.neusoft.day12.myredbag;

import com.neusoft.day12.myredbag.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author liuboting
 * @date 2020/7/27 11:19
 */

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        Random random = new Random();


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < totalCount-1; i++) {
            int money = random.nextInt(leftMoney/leftCount*2);
            list.add(money);
            leftCount--;
            leftMoney -= money;
        }
        list.add(leftMoney);
        return list;
    }
}
