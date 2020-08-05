package com.neusoft.ADailyTopic.Day02_redbag;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author liuboting
 * @date 2020/7/31 8:34
 */

public class Member extends User{

    public Member(String userName, int leftMoney) {
        super(userName, leftMoney);
    }

    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        super.setLeftMoney(super.getLeftMoney() + list.get(index));
        list.remove(index);

    }
}
