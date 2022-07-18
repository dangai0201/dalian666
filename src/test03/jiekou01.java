package test03;



/*
* 接口也是一种引用数据类型
* 接口是完全抽象的（抽象类是半抽象）
* 接口的语法
* 【修饰符列表】 interface 接口名{
* }
* 接口支持多继承，一个接口可以继承多个接口
* 接口中只包含2部分内容，1.常量  2.抽象方法
*
* 类和类之间叫做继承，类和接口之间叫做实现
* 实现使用implements关键字完成
*
* 当一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现（覆盖，重写）
*
* 一个类可以实现多个接口
*
* 接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转
* 但是一定要注意，运行时可能会出现classCastException异常
*
*继承和实现都存在：继承在前，实现在后
*
* */
public class jiekou01 {
    public static void main(String[] args) {
        System.out.println(MyMath.PI);

        //父类型的引用指向子类型的对象
        MyMath mm=new MyMathImp1();
        //调用接口里面的方法（面向接口变成）
        int result1=mm.sum(10,20);
        System.out.println(result1);

        //父类型引用指向子类型对象
        M1 m1=new NN();
        M2 m2=new NN();
        M3 m3=new NN();
        M2 m22=(M2)m1;
        m22.m2();

        NN n1=(NN)m1;
        n1.m2();

        Playball p=new Kalasike();
        p.play();




    }
}

interface AA{
}
interface BB extends AA{
}
interface CC extends AA,BB{
}
interface MyMath{
    //public static final可以省略
    double PI=3.1415926;
    //可以省略public abstract
    int sum(int a ,int b);

    int sub(int a ,int b);

}

//abstract  class MyMathImp1 implements MyMath{
//
//}

class MyMathImp1 implements MyMath{
    public int sum(int a ,int b){
        return a+b;
    }

    public int sub(int a ,int b){
        return a-b;
    }


}

interface M1{
    void m1();
}
interface M2{
    void m2();
}
interface  M3{
    void m3();
}
class NN implements M1,M2,M3 {
    public void m1(){
    }
    public void m2() {
        System.out.println("m2-------- ");
    }
    public void m3() {
    }
}

class Dalian{

}
interface Playball{
    void play();
}
class Kalasike extends Dalian implements Playball{
    public void play() {
        System.out.println("卡拉斯科踢球");
    }
}

