package test1;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class work {
    public static void main(String[] args) {
        f5();

    }
    public static void f1(){
        double depth = 56.7;
        int day = 0;
        double s = 0;

        boolean tar = true;
        while (tar){
            s = s+5;
            if (s>56.5){
                day++;
                break;
            }
            s = s-3.5;
            day++;

        }
        System.out.println(day);


    }
/*
每对兔子在三个月以后又生一对兔子，这应该怎么写？？ 没有思路
用for循环应该不行
------------------
原来是斐波那契数列（兔子数列）
就是找规律、
月份 兔子对数
1    2
2    3
3    5
4    8
5    13

for是对的  简单的加法我没想到，我就想到用数组，存放每个月的兔子数
* */
    public static void f2(){
        int ini = 1;
        int sum = 0;

        int[] a = new int[37];
        a[0]=0;
        a[1]=2;
        a[2]=3;

        for (int i = 3; i <=36 ; i++) {


            a[i] = a[i-1]+a[i-2];
            System.out.println("第"+ i +"个月的兔子总数为"+a[i]);
        }






    }
    public static void f3(){
        int[] A = {1,3,2,4,6,9,11,7};
        int[] B = {4,6,9,1,5,10,0};

        //首先我想到用for循环
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if (A[i] == B[j]){
                    System.out.println(A[i]);
                }

            }

        }

    }
    public static void f4(){

        int a[] = {1,7,9,11,13,15,17,19};
        int b[] = {2,4,6,8,10};

        int[] m = IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray();

        System.out.println(Arrays.toString(m));
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 12; j++) {
                if (m[j]>m[j+1]){
                    m[j] = m[j]^m[j+1];
                    m[j+1] = m[j]^m[j+1];
                    m[j] = m[j]^m[j+1];
                }


            }
            
        }
        System.out.println(Arrays.toString(m));
        
        
    }
    public static void f5(){
        String a = new String("abcdefg");

        for (int i = 0; i < a.length(); i++) {
            if (i%2==0){
                char aa = a.charAt(i);
                char aaUpperCase = Character.toUpperCase(aa);

                System.out.print(aaUpperCase);

                /*char bb = 'b';
                //返回转换后字符的大写形式
                System.out.println(Character.toUpperCase(bb));

                int b = bb+32;
                char BB = (char) b;
                System.out.println(BB);
*/

            }else {
                System.out.print(a.charAt(i));
                System.out.println("受到广泛苦逼");
            }



        }

    }
    public static void f7(){
        int[] A = {1,4,3,5,1,8,6,2,7,3,8,2};

    }
}

