package test15thread.reflect;
/*
* 反编译一个类的constructor
*
* */

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectTest13 {
    public static void main(String[] args) throws  Exception{
        StringBuilder s=new StringBuilder();
        Class vipClass=Class.forName("test15thread.reflect.Vip");
        s.append(Modifier.toString(vipClass.getModifiers()));
        s.append(" class ");
        s.append(vipClass.getSimpleName());
        s.append(" {\n");
        //拼接构造方法
        Constructor[] constructors=vipClass.getDeclaredConstructors();
        for (Constructor constructor:constructors){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName());
            s.append("(");
            //拼接参数
            Class[] paramterTypes=constructor.getParameterTypes();
            for (Class paramter:paramterTypes){
                s.append(paramter.getSimpleName());
                s.append(",");

            }
            if (paramterTypes.length>0){
                //删除最后下标位置上的字符
                s.deleteCharAt(s.length()-1);
            }
            s.append("){}\n");
        }





        s.append("}");

        System.out.println(s);

    }
}
