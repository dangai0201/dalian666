package test15thread;


/*
* 关于线程的优先级
*
* */
public class ThreadTest12 {
    public static void main(String[] args) {

        /*
        System.out.println("最高优先级"+Thread.MAX_PRIORITY);
        System.out.println("最低优先级"+Thread.MIN_PRIORITY);
        System.out.println("默认优先级"+Thread.NORM_PRIORITY);
        */
        //设置主线程优先级为1
        Thread.currentThread().setPriority(1);
        //获取当前线程对象，获取当前线程优先级
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread.getName()+"线程的默认优先级是"+currentThread.getPriority());

        Thread t=new Thread(new MyRunnable5());
        t.setPriority(10);
        t.start();

        //优先级较高的，只是抢到的cpu事件片相对多一些
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }

    }
}

class MyRunnable5 implements Runnable{

    @Override
    public void run() {
        //获取线程的优先级
//        System.out.println(Thread.currentThread().getName()+"线程的默认优先级"+Thread.currentThread().getPriority());

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}