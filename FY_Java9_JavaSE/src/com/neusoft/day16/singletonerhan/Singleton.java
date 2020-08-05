package com.neusoft.day16.singletonerhan;

/**
 * @author liuboting
 * @date 2020/7/31 8:57
 */

public class Singleton {
    private Singleton(){}
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
