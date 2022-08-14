package test16Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//标识这个注解只能出现在类的上面
@Target(ElementType.TYPE)
//该注解可以被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)
public @interface ID {
}
