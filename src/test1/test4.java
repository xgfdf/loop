package test1;

public class test4 {
    public static void main(String[] args) {

        //实例化一只猫（创建一只猫对象）
        Cat cat1 = new Cat();

        cat1.name = "🔅";
        cat1.age = 12;

        System.out.println(cat1.name +" "+ cat1.age);

        System.out.println("tyhrdcrty与韩国黄金矿工预估 就有户口挂靠");


    }


}

//定义一个猫类 cat  -->  自定义的数据类型
class Cat{
    //属性
    String name; //猫的名字
    int age; //猫的年龄
    String color; //猫的颜色

}
