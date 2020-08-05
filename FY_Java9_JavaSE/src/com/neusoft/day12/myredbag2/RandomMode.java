package com.neusoft.day12.myredbag2;

import com.neusoft.day12.myredbag2.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author liuboting
 * @date 2020/8/2 15:12
 */

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = totalMoney;
        for (int i = 0; i < count; i++) {
            int Money = random.nextInt(leftMoney/count * 2);
            list.add(Money);
        }
        return list;
    }
}
