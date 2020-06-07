package com.neusoft;

/**
 * @author liuboting
 * @date 2020/6/6 17:09
 */

public class MethodC extends MethodB{
    int numc = 30;
    @Override
    public void showA() {
        System.out.println(numa);
    }

    @Override
    public void showB() {
        System.out.println(numb);
    }

    public void showC(){
        System.out.println(numc);
    }
}
