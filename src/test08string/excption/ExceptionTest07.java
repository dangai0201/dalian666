package test08string.excption;

public class ExceptionTest07 {
    public static void main(String[] args) {
        //final是一个关键子，标识最终的。不变的
        //final修饰的方法无法覆盖，final修饰的类无法继承，final修饰的变量不能重新赋值
        final int i =100;

        //finally是一个关键子，和try联合使用，使用在异常处理机制中
        //finally语句中的代码是一定会执行的
        try{

        }finally {
            System.out.println("finally.....");
        }

        //finalize()是object类中的一个方法。作为方法名出现
        //所有finalize是标识符
        //finalize()方法是jvm的GC垃圾回收器负责调用
        Object obj;
    }
}
