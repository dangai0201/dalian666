package test15thread;

public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t=new MyThread3();
        t.setName("t");
        t.start();
        try {
            //在执行的时候还是会转换成：Thread.sleep(1000*5)
            //这行代码的作用是：让当前线程进入休眠，也就是说main线程进入休眠
            t.sleep(5*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello dalian");

    }
}

class MyThread3 extends  Thread{
    public void  run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);

        }
    }
}
