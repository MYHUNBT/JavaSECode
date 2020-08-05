package com.neusoft.day12.redbag;

import com.neusoft.day12.redbag.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author liuboting
 * @date 2020/7/27 9:21
 */

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/totalCount;
        for (int i = 0; i < totalCount; i++) {
            if(i == totalCount-1){
                list.add(avg + totalMoney%totalCount);
            }else {
                list.add(avg);
            }
        }
        return list;
    }
}
