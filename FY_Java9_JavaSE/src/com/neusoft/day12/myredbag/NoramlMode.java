package com.neusoft.day12.myredbag;

import com.neusoft.day12.myredbag.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/27 11:19
 */

public class NoramlMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/totalCount;
        int mod = totalMoney%totalCount;
        for (int i = 0; i < totalCount; i++) {
            if(i == totalCount-1){
                list.add(avg+mod);
            }else {
                list.add(avg);
            }
        }
        return list;
    }
}
