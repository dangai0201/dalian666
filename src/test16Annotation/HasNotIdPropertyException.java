package test16Annotation;

/*
* 自定义异常
*
* */
public class HasNotIdPropertyException extends RuntimeException{
    public HasNotIdPropertyException(){

    }
    public HasNotIdPropertyException(String s){
        super(s);
    }

}
