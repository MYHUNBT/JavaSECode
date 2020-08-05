package com.neusoft.day12.myredbag;

/**
 * @author liuboting
 * @date 2020/7/27 11:18
 */

public class BootStrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("抢红包");
        NoramlMode noramlMode = new NoramlMode();
        RandomMode randomMode = new RandomMode();
        myRed.setOwnerName("冤大头2");
        myRed.setOpenWay(randomMode);
    }
}
