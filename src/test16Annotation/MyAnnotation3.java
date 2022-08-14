package test16Annotation;

/*
 * 注解的属性名字是value的话并且只有一个属性的话，在使用的时候，该属性名可以省略
 *
 * */


public @interface MyAnnotation3 {

    //指定一个value属性
    String value();

//    String email();
}
