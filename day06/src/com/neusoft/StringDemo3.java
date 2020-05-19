package com.neusoft;

/**
 * @author liuboting
 * @date 2020/5/19 13:22
 */

public class StringDemo3 {
    private char[] value;
    public StringDemo3(char[] value){
        this.value = value;
    }
    public boolean equals(Object anObject){
        //两个对象地址是否一样，是，肯定是同一个对象
        if(this == anObject){
            return true;
        }
        //判断目前这个对象是否是String的实例
        if(anObject instanceof StringDemo3){
            //强转为StringDemo3类型
            StringDemo3 anotherString = (StringDemo3)anObject;
            int n = this.value.length;
            if(n == anotherString.value.length){
                char[] s1 = this.value;
                char[] s2 = anotherString.value;
                int i = 0;
                while (n-- != 0){
                    if(s1[i] != s1[i]){
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}
