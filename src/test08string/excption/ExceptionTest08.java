package test08string.excption;

public class ExceptionTest08 {
    public static void main(String[] args) {
        MyException e=new MyException("用户名错误");
        //打印异常堆栈信息
        e.printStackTrace();
        //获取异常简单描述信息
        String msg=e.getMessage();
        System.out.println(msg);

    }
}
