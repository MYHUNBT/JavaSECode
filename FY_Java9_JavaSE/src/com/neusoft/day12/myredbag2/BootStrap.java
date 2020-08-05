package com.neusoft.day12.myredbag2;

import com.neusoft.day12.myredbag2.utils.OpenMode;

import java.util.Random;

/**
 * @author liuboting
 * @date 2020/8/2 15:09
 */

public class BootStrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("lbt");
        OpenMode normalMode = new NormalMode();
        OpenMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);
        myRed.setOwnerName("冤大头");
    }
}
