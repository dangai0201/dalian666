package test16Annotation;

/*
*标识性注解，给编译器做参考的
*编译器看到方法上有这个注解的时候，编译器会自动检查该方法是否重写了父类的方法
* 如果没有重写，报错
* 这个注解只是在编译阶段起作用，和运行阶段没关
*
* Override注解，只能注解方法，是给编译器参考的，和运行阶段没有关系
* 凡是java中的方法带有这个注解的，编译器都会进行编译检查，如果这个方法不是重写父类的方法，编译器报错
*
* 用来标注注解类型的注解，叫做元注解
* 元注解：
* Target 用来标注被标注的注解可以出现在哪些位置上
* @Target(ElementType.METHOD)表示：被标注的注解，只能出现在方法上
* Retention用来标注被标注的注解最终保存在哪里
*@Retention(RetentionPolicy.SOURCE)表示：只被保留在java源文件中
*@Retention(RetentionPolicy.CLASS)表示：保存在class文件中
*@Retention(RetentionPolicy.RUNTIME)表示：被保存在class文件中，并且可以被反射机制所读取
* */
public class AnnotationTest02 {
    @Override
    public String toString() {
        return "toString";
    }
}
