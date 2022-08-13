package test16Annotation;

public @interface MyAnnotation2 {

    /**
     * 以下是Annotation的name属性
     * @return
     */

    String name();
    String color();
    int age() default 26;//属性指定默认值
}
