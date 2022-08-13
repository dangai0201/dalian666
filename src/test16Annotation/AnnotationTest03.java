package test16Annotation;
/*
* 标识这个类已过时
*
*
* */
@Deprecated
public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03 at=new AnnotationTest03();
        at.doSome();
    }

    @Deprecated
    public  void doSome(){
        System.out.println("do something");
    }

    //Deprecated这个注解标注的元素已过时
    @Deprecated
    public  static void doOther(){
        System.out.println("do other");
    }


}
class  T{
    public static void main(String[] args) {
        AnnotationTest03 at=new AnnotationTest03();
        at.doSome();
        AnnotationTest03.doOther();
    }
}
