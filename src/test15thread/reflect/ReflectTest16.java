package test15thread.reflect;
/*
* 获取一个类的父类,获取一个类实现了哪些接口
*
* */
public class ReflectTest16 {
    public static void main(String[] args) throws  Exception{
        Class stringClass=Class.forName("java.lang.String");
        //获取String的父类
        Class superClass=stringClass.getSuperclass();
        System.out.println(superClass.getName());

        //获取String类实现的所有接口（一个类可以实现多个接口）
        Class[] interfaces=stringClass.getInterfaces();
        for (Class inter:interfaces){
            System.out.println(inter.getName());
        }


    }
}
