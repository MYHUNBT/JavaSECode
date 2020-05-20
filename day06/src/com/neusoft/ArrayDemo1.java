package com.neusoft;

import java.util.Arrays;

/**
 * @author liuboting
 * @date 2020/5/17 20:09
 */

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {3,7,5,9,1,2};
        System.out.println(arr); //[I@1b6d3586
        System.out.println("排序前：" + Arrays.toString(arr)); //排序前：[3, 7, 5, 9, 1, 2]
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr)); //排序后：[1, 2, 3, 5, 7, 9]

        // String line = "DSAmsadsaopMIPLOK";
        // 字符升序排序，并且倒序打印
        String line = "DSAmsadsaopMIPLOK";
        char[] line1 = line.toCharArray();
//        System.out.println(Arrays.toString(line1));
        Arrays.sort(line1);
        System.out.println(Arrays.toString(line1)); //[A, D, I, K, L, M, O, P, S, a, a, d, m, o, p, s, s]
        for (int i = line1.length - 1; i > 0; i--) {
            System.out.print(line1[i] + "\t");  //s	 s	p	o	m	d	a	a	S	P	O	M	L	K	I	D
        }
    }
}
