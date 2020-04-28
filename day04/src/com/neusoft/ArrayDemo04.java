package com.neusoft;

/**
 * @author liuboting
 * @date 2020/4/26 15:26
 * 对数组进行反转
 */

public class ArrayDemo04 {
    public static void main(String[] args) {

        //方法一
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length-i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

//        方法二
//
//        int[] arr = new int[]{1,2,3,4,5};
//        for (int i = 0; i < arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }


        //方法三
//        /**
//         * for (初始化条件1,初始化条件2; 循环条件; 步进运算1,步进运算2)
//         * 定义 min = 0 最小索引值， max = arr.length-1 最大索引值
//         */
//        int[] arr = new int[]{1,2,3,4,5};
//        for (int min =0,max = arr.length-1;min <= max; min++ , max--){
//            int temp = arr[min];
//            arr[min] = arr[max];
//            arr[max] = temp;
//        }
//        // 重新遍历反转的数组
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//    }

    }
}
