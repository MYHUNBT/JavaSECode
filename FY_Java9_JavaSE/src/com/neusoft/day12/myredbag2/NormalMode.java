package com.neusoft.day12.myredbag2;

import com.neusoft.day12.myredbag2.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/8/2 15:12
 */

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/count;
        for (int i = 0; i < count; i++) {
            if(i == count-1){
                list.add(totalMoney - avg*(count-1));
            }else {
                list.add(avg);
            }
        }
        return list;
    }
}
