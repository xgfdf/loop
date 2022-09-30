package test1;

public class demo1 {
    public static void main(String[] args) {
        //控制行数
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");

            }
            System.out.println();
            
        }
    }
}
