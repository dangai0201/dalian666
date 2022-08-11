package test15thread.reflect;
/*
 * 反编译一个类的方法
 *
 * */

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectTest11 {
    public static void main(String[] args) throws Exception{
        StringBuilder s=new StringBuilder();
        Class userServiceClass=Class.forName("java.lang.String");
//        Class userServiceClass=Class.forName("test15thread.reflect.UserService");
        s.append(Modifier.toString(userServiceClass.getModifiers())+" class "+
                userServiceClass.getSimpleName()+" {\n");

        Method[] methods=userServiceClass.getDeclaredMethods();
        for (Method method:methods){
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            //参数列表
            Class[] paramerters=method.getParameterTypes();
            for (Class paramer:paramerters){
                s.append(paramer.getSimpleName());
                s.append(",");
            }
            //删除指定下标位置上的字符
            s.deleteCharAt(s.length()-1);

            s.append("){}\n");

        }




        s.append(" }");
        System.out.println(s);


    }
}
