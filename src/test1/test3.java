package test1;

public class test3 {
    public static void main(String[] args) {

        int a = 2;
        int b = 2;

        String s1 = "aaa";
        String s2 = new String("aaa");
        s2 = "adfcsaa";
        s2 = "afsdasdgsdfas";

        //System.out.println(s2);

        //初始化一个空的StringBuffer对象;
        StringBuffer s3 = new StringBuffer();


        //创建带内容的StringBuffer对象
        StringBuffer s4 = new StringBuffer("abac");

        s4.append("zzzz");

        s3.append(s2);
        System.out.println(s3);

    }
}
