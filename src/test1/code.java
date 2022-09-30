package test1;

import java.util.Scanner;

public class code {

public static void main(String[] args) {
    f2();




}
public static void f1(){
    //    大家都知道一些办公软件有自动将字母转换为大写的功能。输入一个长度不超过 100100 且不包括空格的字符串。
//    要求将该字符串中的所有小写字母变成大写字母并输出。
//    输入输出样例
//    输入 #1复制
//    Luogu4!
//    输出 #1复制
//    LUOGU4!
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    System.out.println(a.toUpperCase());
}
public static void f2(){
//    某蒟蒻迷上了 “小书童”，有一天登陆时忘记密码了（他没绑定邮箱 or 手机），于是便把问题抛给了神犇你。
//    题目描述
//    蒟蒻虽然忘记密码，但他还记得密码是由一个字符串组成。
//    密码是由原文字符串（由不超过 50 个小写字母组成）中每个字母向后移动 n 位形成的。
//    z 的下一个字母是 a，如此循环。他现在找到了移动前的原文字符串及 n，请你求出密码
//    输入：
//    第一行：n第二行：未移动前的一串字母。
//
//    输出格式：一行，是此蒟蒻的密码。
//    输入
//    1
//    qwe
//    输出rxf
    Scanner sc = new Scanner(System.in);
    //char b = 'a';
    char q ='b' + 2;
    System.out.println(q);



    int number = sc.nextInt();
    String s = sc.next();
    int len = s.length();


    //遍历字符串的每一个字符
    for (int i = 0; i < len; i++) {
        char sa = s.charAt(i);
        char sb = (char) (sa + number);
        //char sb = String.valueOf(sa) + number;

        System.out.print(sb);

    }
    
    


}
}
