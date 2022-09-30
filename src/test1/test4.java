package test1;

public class test4 {
    public static void main(String[] args) {
        cat cat1 = new cat();
        cat1.name = "🔅";
        cat1.age = 12;
        System.out.println(cat1.name +" "+ cat1.age);
    }


}


class cat{
    String name;
    int age;
    String color;

}
