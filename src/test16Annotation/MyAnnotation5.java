package test16Annotation;
/*
* 注解中属性可以是以下这些类型
* byte,short,int,float,double,boolean,char,String,Class，枚举类型
* 以及以上每一种的数组形式
*
* */


public @interface MyAnnotation5 {

    int value1();
    String  value2();
    int[] value3();
    String[] value4();
    Season1 value5();
    Season1[] value6();
    Class paramterType();
    Class[] paramterTypes();


}
