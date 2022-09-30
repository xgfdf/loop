package test1;

import java.util.Arrays;

public class tes4 {
    public static void main(String[] args) {
        /*int[] a = {2,1,3,5,7,2,1,4,5,8,0,8,5,9};
        1)求出上面数组0-9分别出现的次数
        2)求出上面数组奇数个数和偶数个数
        3)找出数组中的最大值与最小值*/

        int[] a = {2,1,3,5,7,2,1,4,5,8,0,8,5,9};

        int[] sum = new int[10];
        for (int j:a
             ) {
            sum[j]++;

        }
        System.out.println(Arrays.toString(sum));
        int a1,b,c,d,e,f,g;
        int max=a[0],min;
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max);
            /*a[i] = max ^ a[i];
            max = max ^ a[i];
            a[i] = max ^ a[i];*/
            max = a[i];

        }
        System.out.println(max);




    }
}
