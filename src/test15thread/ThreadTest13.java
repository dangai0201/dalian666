package test15thread;

/*
* 让位，当前线程暂停，回到就绪状态，让给其他线程
* 静态方法：Thead.yield();
*
* */

public class ThreadTest13 {
    public static void main(String[] args) {
        Thread t=new Thread(new MyRunnable6());
        t.setName("t");
        t.start();
        for (int i = 1; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }


    }
}
class  MyRunnable6 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            //每10个让位一次
            if (i%10==0){
                //当前线程暂停一下，让给主线程
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }

    }
}