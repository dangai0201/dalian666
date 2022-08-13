package test16Annotation;

public class AnnotationTest05 {
    //如果注解当中有属性，必须给属性赋值（除非该属性使用default指定了默认值）
    @MyAnnotation2(name="dalian",color = "dalian")
    public void doSome(){

    }

}
