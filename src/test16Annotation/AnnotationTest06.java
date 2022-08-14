package test16Annotation;

/*
* 注解的属性名字是value的话并且只有一个属性的话，在使用的时候，该属性名可以省略
*
* */
public class AnnotationTest06 {
    @MyAnnotation3(value = "dalian")
    public void doSome(){

    }
    @MyAnnotation3("dalian")
    public void doOther(){

    }

}
