package test15thread.reflect;

import java.util.Date;

/*
* 操作一个类的字节码，需要首先获取到这个类的字节码
*
* */
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
        * Class.forName()
        * 1.静态方法
        * 2.方法的参数是一个字符串
        * 3.字符串需要的是一个完整的类名
        * 4.完整类名必须带有包名。java.lang包也不能省略
        *
        * */
        //c1代表String.class文件，或者说c1代表String类型
        Class c1=null;
        Class c2=null;
        try {
            c1=Class.forName("java.lang.String");
            c2=Class.forName("java.util.Date");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法：getClass()
        String s="abc";
        Class x=s.getClass();//x代表String.class字节码文件，x代表String类型
        System.out.println(c1==x);//(==代表的是对象的内存地址)

        Date time=new Date();
        Class y=time.getClass();
        System.out.println(c2==y);//c2和y两个变量中保存的内存地址都是一样的，都指向方法区的字节码文件


        //第三种方式，java语言中任何一种类型，包括基本数据类型，它都有.class属性

        Class z=String.class;
        Class k=Date.class;
        System.out.println(x==z);




    }
}
