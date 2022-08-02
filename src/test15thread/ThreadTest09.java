package test15thread;

public class ThreadTest09 {
    public static void main(String[] args) {
        Thread t=new Thread(new MyRunnable2());
        t.setName("t");
        t.start();
        try {
            //希望5s之后，t线程醒来
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //终端t线程的睡眠（依靠了java的异常处理机制）
        t.interrupt();

    }
}
class MyRunnable2 implements Runnable{

    //run()当中的异常不能throws，只能try catch
    //因为run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"----> begin");
        try {
            Thread.sleep(1000*60*60*24);
        } catch (InterruptedException e) {
            //打印异常信息
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"----> end");
    }
}