package test15thread;

/*
* 守护线程
* java语言中线程分为两大类
* 一类是：用户线程
* 一类是：守护线程（后台线程）
* 其中具有代表性的就是：垃圾回收线程（守护线程）
*  守护线程的特点：一般守护线程是一个死循环，所有的用户线程只要结束，守护线程自动结束
*注意：主线程 main方法是一个用户线程
*
*
* */


public class ThreadTest16 {
    public static void main(String[] args) {
        Thread t=new BakData();
        t.setName("备份数据的线程");
        //启动线程之前，将线程设置为守护线程
        t.setDaemon(true);

        t.start();

        //主线程：主线程是用户线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class BakData extends Thread{
    @Override
    public void run() {
       int i=0;
       while (true){
           //即使是死循环，但由于该线程是守护者，当用户线程结束，守护线程自动终止
           System.out.println(Thread.currentThread().getName()+"-->"+(++i));
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}