package test16Annotation;

public class ReflectAnnotationTest08 {
    public static void main(String[] args) throws  Exception{
        //获取这个类
        Class c=Class.forName("test16Annotation.AnnotationTest08");
        //判断类上面是否有MyAnnotation7
//        System.out.println(c.isAnnotationPresent(MyAnnotation7.class));

        if (c.isAnnotationPresent(MyAnnotation7.class)){
            //获取该注解对象
            MyAnnotation7 myAnnotation7=(MyAnnotation7) c.getAnnotation(MyAnnotation7.class);
            System.out.println("类上面的注解对象："+myAnnotation7);
            //获取注解对象属性
            String value=myAnnotation7.value();
            System.out.println(value);

        }



        //判断String类上面是否存在这个注解
        Class stringClass=Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation7.class));


    }
}
