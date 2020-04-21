package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/12 16:54
 */
// 把 1~ 100 之间的数字 按照一行6个进行输出
public class Text04 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=100;i++){
            count++;
            System.out.print(i + " ");
            if(count%6 == 0){
                System.out.println();
            }

        }
    }
}
