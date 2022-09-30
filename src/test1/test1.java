package test1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        char[] zimu = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q'
        ,'r','s','t','u','v','w','x','y','z'};

        Scanner sc = new Scanner(System.in);
        //接受数字和字符串
        int number = sc.nextInt();
        String s = sc.next();
        int len = s.length();

        for (int i = 0; i < len; i++) {

            char sa = s.charAt(i) ;
            for (int j = 0; j < 26; j++) {
                if (zimu[j] == sa) {

                    System.out.print(zimu[(j + number)%26]);
                   break;
                }


            }


        }
    }
}
