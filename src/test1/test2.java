package test1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextInt();
        String s = sc.next();
        int len = s.length();
        //System.out.println('a'+1);

        for (int i = 0; i <len; i++) {
            if ((char)(s.charAt(i)+number)<='z'){
//                char sa = s.charAt(i);
//                char sb = (char) (sa + number);
//                System.out.print(sb);
                char ss = (char)(s.charAt(i)+number);
                System.out.println(ss);
            }else {
                System.out.print((char)(s.charAt(i)+number-26) );
//                char sa1 = s.charAt(i);
//                char sb1 = (char) ((number%26 - ('z'-sa1))+'a'-1);
               // char sb1 = (char) (sa1+number%26 - 26);


               // System.out.print(sb1);

            }

        }
    }
}
