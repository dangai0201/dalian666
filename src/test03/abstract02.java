package test03;



/*
* 一个非抽象类集成抽象类，必须讲抽象类中的抽象方法实现了(覆盖或重写)
*
*
*
* */
public class abstract02 {
    public static void main(String[] args) {
        //父类型引用指向子类型对象
        Animal a=new Bird();//这就是面向抽象编程,向上转型（自动类型转换）
        a.move();

    }
}


abstract class  Animal{
    public abstract void move();
}

class Bird extends Animal{
    //一个非抽象类集成抽象类，必须讲抽象类中的抽象方法实现了
    public void move(){
        System.out.println("鸟儿在飞翔");

    }
}