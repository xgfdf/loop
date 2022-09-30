package test1;
//        1 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
//        2 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
//        3 有一个400米一圈的操场，一个人要跑10000米，第一圈50秒，其后每一圈都比前一圈慢1秒，按照这个规则计算跑完10000米需要多少秒？

public class demo3 {
    public static void main(String[] args) {
f3();

    }
    public static void f1(){
        double height = 100;
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            height = height / 2;

        }
        System.out.println(height);
    }

    //我刚开始想的就是多重循环，但觉得这个题有点复杂，还不能又重复数字
    //后来又想可以用数组，但是应该是不行的
    public static void f2(){
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i!=k&&i!=j&&j!=k){
                        System.out.print(i);
                        System.out.print(j);
                        System.out.println(k);
                    }
                }
            }
        }
    }
    //3 有一个400米一圈的操场，一个人要跑10000米，第一圈50秒，其后每一圈都比前一圈慢1秒，按照这个规则计算跑完10000米需要多少秒？
    public static void f3(){
        int s;
        int t = 50;
        int length = 10000;
        int round = 0;
        int time = 0;


        while (length-round>0){
            time+=t;
            t++;
            round+=400;
        }
        System.out.println(time);
        System.out.println("yhjvb");

    }

}
