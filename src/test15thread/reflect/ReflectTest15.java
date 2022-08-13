package test15thread.reflect;

import java.lang.reflect.Constructor;

/*
* 使用反射机制调用构造方法是路滑java对象
*
* */
public class ReflectTest15 {
    public static void main(String[] args) throws  Exception{
        //不使用反射机制怎么创建对象
        Vip v1=new Vip();
        Vip v2=new Vip(110,"dalian","2016-06-06",true);

        //使用反射机制怎么创建对象
        Class c=Class.forName("test15thread.reflect.Vip");
        //调用无参构造方法
        Object obj=c.newInstance();
        System.out.println(obj);

        //使用有参构造方法
        Constructor con=c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        //调用构造方法new对象
        Object newobj=con.newInstance(110,"dalian","2016-06-06",true);
        System.out.println(newobj);

        //获取无参构造方法
        Constructor con2=c.getDeclaredConstructor();
        Object newobj2=con2.newInstance();
        System.out.println(newobj2);

    }
}
