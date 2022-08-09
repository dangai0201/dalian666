package test15thread.reflect;
/*
* 使用反射机制，去访问一个对象的属性（set,get）
*
* */

import java.lang.reflect.Field;

public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        /*Student s=new Student();

        //给属性赋值
        s.no=111;//三要素：给s对象的no属性赋值111      1.对象s 2.no属性 3.111

        //读属性值
        System.out.println(s.no);
        */

        Class studentClass=Class.forName("test15thread.reflect.Student");
        Object obj=studentClass.newInstance();//obj就是Student对象（底层调用无参数构造方法）



        //获取no属性（根据属性的名称来获取Field）
        Field noField=studentClass.getDeclaredField("no");

        //给obj对象（Student对象）的no属性赋值
        /*
        * 虽然使用了反射机制，但是三要素还是缺一不可
        * 要素1：obj对象
        * 要素2：no属性
        * 要素3：666值
        *
        * */

        noField.set(obj,666);//给obj对象的no属性赋值666

        //读取属性的值
        //两个要素：获取obj对象的no属性的值
        System.out.println(noField.get(obj));


        //访问私有属性
        Field nameField=studentClass.getDeclaredField("name");


        //打破封装(反射机制的缺点：打破封装，可能会给不发分子留下机会)
        //这样设置完成之后，在外部也可以访问private
        nameField.setAccessible(true);

        //给属性赋值
        nameField.set(obj,"dalian");

        //获取属性的值
        System.out.println(nameField.get(obj));











    }
}
