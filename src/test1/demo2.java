package test1;

import java.util.Arrays;
public class demo2 {
    public static void main(String[] args) {

        int[] arr = new int[]{32,5,432,3,1};

        //定义循环控制比较轮数
        for (int i = 0; i <arr.length ; i++) {

            //定义循环控制每轮比较的次数
            //j < arr.length - i
            for (int j = 0; j < arr.length - i-1; j++) {
                //这么写会出现数组越界
                //因为在第一轮的时候，j = 0;j<5;j++
                //j = 4 的时候条件成立，此刻比较 arr[4] 和arr[5]，数组越界！
                if (arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
//                if (arr[j-1] > arr[j]){
//
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
            }


        }
        System.out.println(Arrays.toString(arr));

        }

    }
