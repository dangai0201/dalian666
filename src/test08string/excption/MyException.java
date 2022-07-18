package test08string.excption;

/*自定义异常
* 1.编写一个类继承Exception或者RuntimeException
* 2.提供两个构造方法，一个无参数的，一个带有String参数的
*
* */

public class MyException extends Exception{//编译时异常
    public MyException(){

    }
    public MyException(String s) {
        super(s);
    }
}

//public class MyException extends RuntimeException{//运行时异常
//
//}

