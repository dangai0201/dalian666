package test16Annotation;

public class AnnotationTest07 {

    //数组是大括号
    @MyAnnotation6(age=16,email = {"dalian1@110.com","dalian3@110.com"},seasonArray =Season1.WINTER)
    public void doSome(){
    }

    //如果数组中只有1个元素：大括号可以省略
    @MyAnnotation6(age = 17 ,email = "dalian@110.com",seasonArray = {Season1.AUTUMN,Season1.WINTER})
    public void doOther(){
    }



}
