package test08string.excption;

public class ExcptionTest03 {
    public static void main(String[] args) {
        NullPointerException nullPointerException=new NullPointerException("空指针异常");
        //获取异常简单的描述信息：这个信息实际上就是构造方法上面String参数
        String msg=nullPointerException.getMessage();
        System.out.println(msg);
        //打印异常追踪的堆栈信息:采用异步线程的方式打印的
        nullPointerException.printStackTrace();

        System.out.println("dalian");
    }
}
