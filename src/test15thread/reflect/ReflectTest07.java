package test15thread.reflect;
/*
* 通过反射机制，反编辑一个类的属性Field
*
* */


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest07 {
    public static void main(String[] args) throws  Exception{
        //创建这个是为了拼接字符串
        StringBuilder s=new StringBuilder();
//        Class studentClass=Class.forName("test15thread.reflect.Student");
        Class studentClass=Class.forName("java.util.Date");

        s.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+" {\n");

        Field[] fields=studentClass.getDeclaredFields();

        for (Field field:fields){
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append(";\n");

        }

        s.append("}");

        System.out.println(s);


    }
}
