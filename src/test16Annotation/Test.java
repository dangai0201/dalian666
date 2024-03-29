package test16Annotation;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws  Exception{
        //获取类
       Class userClass= Class.forName("test16Annotation.User");
       boolean isOK=false;//给一个默认的标记
       //判断类上是否存在ID注解
        if (userClass.isAnnotationPresent(ID.class)){
            //当一个类上面有@ID注解的时候，要求类中必须存在int类型的id属性
            //如果类中没有int类型的id属性则报异常
            //获取类的属性
            Field[] fields=userClass.getDeclaredFields();
            for (Field field:fields){
                if ("id".equals(field.getName()) &&"int".equals(field.getType().getSimpleName())){
                    //表示这个类是合法的类。有@id注解，则这个类必须有int类型的id
                    isOK=true;//表示合法
                    break;
                }
            }
            //判断是否合法
            if (!isOK){
                throw new HasNotIdPropertyException("被@id注解标注的类中必须要有一个int类型的id属性");
            }





        }
    }
}
