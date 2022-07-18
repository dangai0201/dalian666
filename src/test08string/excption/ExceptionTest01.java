package test08string.excption;


/*
* 异常在java中以类的形式存在，每一个异常类都可以创建对象。
* 所有异常都是发生在运行阶段的
* java语言中对异常的处理方式的两种方式：
* 第一种方式：在方法声明的位置上，使用throws关键子，抛给上一级,谁调用这个方法，就抛给谁，抛给调用者来处理
* 第二种方式：使用try catch语句进行异常的捕捉
* */

public class ExceptionTest01 {
//    public static void main(String[] args) throws ClassNotFoundException {
    public static void main(String[] args)  {
        //通过异常类实例化异常对象
        NumberFormatException numberFormatExceptio= new NumberFormatException("数字化格式异常");
        System.out.println(numberFormatExceptio);
        NullPointerException nullPointerException=new NullPointerException("空指针异常发生了");
        System.out.println(nullPointerException);
        //异常在java中以类和对象的形式存在

        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    public static void doSome() throws  ClassNotFoundException{
        System.out.println("大连");
    }
}
