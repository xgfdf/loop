package test1;

public class test4 {
    public static void main(String[] args) {


        //实例化一只猫（创建一只猫对象） 就是实例化对象
        Cat cat1 = new Cat();//把创建的猫的引用赋给cat1

        cat1.name = "🔅";
        cat1.age = 12;

        //用一个对象可以管理多个属性

        //创建第二个猫对象
        Cat cat2 = new Cat();
        cat2.name = "❀";
        cat2.age = 3;
        cat2.color = "white";


        System.out.println(cat1.name +" "+ cat1.age);


    }
}

//定义一个猫类 cat  -->  自定义的数据类型
class Cat{
    //属性
    String name; //猫的名字
    int age; //猫的年龄
    String color; //猫的颜色

    //还可以添加行为

}
