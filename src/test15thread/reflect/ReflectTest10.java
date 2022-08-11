package test15thread.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * 反射method
 * */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        //获取类
        Class userServiceClass=Class.forName("test15thread.reflect.UserService");

        //获取所有的method(包括私有的)
        Method[] methods=userServiceClass.getDeclaredMethods();

        System.out.println(methods.length);

        //遍历method
        for (Method method:methods){
            //获取修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));
            //获取方法的返回值类型
            System.out.println(method.getReturnType().getSimpleName());
            //获取方法名
            System.out.println(method.getName());
            //方法的修饰符列表（一个方法的参数可能会有多个）
            Class[] paramters=method.getParameterTypes();
            for (Class paramter:paramters){
                System.out.println(paramter.getSimpleName());
            }


        }




    }
}
