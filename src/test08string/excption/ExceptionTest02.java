package test08string.excption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




/*
* try... catch
* 1.catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型
* 2.catch可以写多个，建议catch的时候，精确地一个一个处理。这样有利于程序的调优
*3.catch写多个的时候，从上到下，必须遵守从小到大。
* */

public class ExceptionTest02 {
    //一般不建议在main方法上使用throws，因为这个异常如果真正发生了，一定会推给jvm。jvm只有终止
    //异常处理机制的作用就是增强程序的及健壮性
    //一般main方法中的异常建议使用try...catch进行捕捉。main就不要继续上抛了。
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
        } catch (Exception e) {
            //这个分支中可以使用e引用，e引用保存的内存地址是那个new出来异常对象的内存地址
            //catch是捕捉异常后走的分支
            System.out.println("文件找不到！");


            //一行一行，从上往下看
            //sun写的代码不用看了（看报名知道自己的还是sun的）
            //主要问题是出现在自己编写的代码上
            e.printStackTrace();
        }
        System.out.println("main over");
    }
    public static void m1() throws Exception{
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");

    }
    public static void m2() throws IOException{
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }
    public static void m3()  throws FileNotFoundException{


//创建一个输入流对象，该流指向一个文件
        new FileInputStream("/Users/yuliguo/Downlads/20200430134449_60961.png");

        /*try {
            new FileInputStream("/Users/yuliguo/Downloads/20200430134449_60961.png");
            System.out.println(100/0);
            //JDK8的新特性
        } catch (FileNotFoundException |ArithmeticException e) {
            e.printStackTrace();
        }*/


    }
}
