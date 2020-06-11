package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/7 15:06
 */

public interface Pat {
    public void shouyang();
    //抽象方法重名
    void show();
    //默认方法重名
    default void method(){
        System.out.println("Pat");
    }
}
