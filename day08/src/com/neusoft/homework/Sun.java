package com.neusoft.homework;

/**
 * @author liuboting
 * @date 2020/6/7 19:05
 */

public class Sun extends Star implements Universe{

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着九大行星旋转");
    }

    @Override
    public void shine() {
        System.out.println("sun:光照八分钟，到达地球");
    }
}
