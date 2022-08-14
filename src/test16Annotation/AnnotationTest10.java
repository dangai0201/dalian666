package test16Annotation;

import java.lang.reflect.Method;

public class AnnotationTest10 {
    @MyAnnotation8(username = "dalian",password = "12313")
    public void doSome(){

    }

    public static void main(String[] args) throws  Exception{
        //获取AnnotationTest10的doSome方法上的注解信息
        Class c=Class.forName("test16Annotation.AnnotationTest10");
        //获取doSome()方法
        Method doSomeMethod=c.getDeclaredMethod("doSome");
        //判断该方法上是否存在这个注解
        if (doSomeMethod.isAnnotationPresent(MyAnnotation8.class)){
            MyAnnotation8 myAnnotation8=doSomeMethod.getAnnotation(MyAnnotation8.class);
            System.out.println(myAnnotation8.username());
            System.out.println(myAnnotation8.password());
        }

    }

}
