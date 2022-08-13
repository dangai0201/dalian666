package test16Annotation;

/*
* Annotation是一种引用数据类型，编译之后也是成成xxx.class文件
*注解可以出现任意位置
* */
@MyAnnotation
public class AnnotationTest01 {
    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01() {
    }
    @MyAnnotation
    public static void m1(){
        @MyAnnotation
        int i=100;
    }
    @MyAnnotation
    public void m2(@MyAnnotation  String name,@MyAnnotation int K){
        }
}

@MyAnnotation
interface  MyInterface{

}
@MyAnnotation
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}