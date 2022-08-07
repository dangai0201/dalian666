package test15thread.reflect;
/*
* 重点：如果你只希望一个类的静态代码块执行，其他代码一律不执行
* 你可以使用Class.forName（）这个方法的执行会导致类加载，类加载时，静态代码块执行
*
*
* */
public class ReflectTest05 {
    public static void main(String[] args) {
        try {
//            Class.forName()这个方法的执行会导致：类加载
            Class.forName("test15thread.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class MyClass{
    //静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("MyClass 类的静态代码块执行了");
    }
}