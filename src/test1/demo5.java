package test1;

public class demo5 {

    String name;
    int age;

    public demo5(){

    }
    public void speak(){
        System.out.println("十大科技孵化吧");
    }

    public demo5(String aa,int bb){
        name = aa;
        age = bb;
    }

    public static void main(String[] args) {
        demo5 d1 = new demo5();
        d1.name = "张三";
        System.out.println(d1.name);

    }
}
