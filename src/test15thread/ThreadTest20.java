package test15thread;

import java.util.ArrayList;
import java.util.List;

/*
* 使用wait()方法和notify()方法实现生产者和消费者模式
*
* 1.生产线程负责生产，消费线程负责消费，生产线程和消费线程要达到均衡
* 这是一种特殊的业务需求，这种特殊的情况下需要使用wait()方法和notify()方法
* 2.wait()和notify()方法不是线程对象的方法，是普通java对象都有的方法
* 3.wait()方法和notify()方法建立在线程同步的基础上，因为多线程要同时操作一个仓库，有现成安全问题
* 4.wait()方法的作用：o.wait()让正在o对象上的活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁
* 5.notify()方法的作用：o.notify()让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁。
*
*需求描述：
* 仓库采用list集合
* list集合中假设只能存储一个元素
* 1个元素就表示仓库满了
* 如果list集合中元素个数是0，表示仓库空了
* 保证list集合中永远都是最多存储1个元素
* 必须做到效果：生产1个，消费1个
*
*
*
* */
public class ThreadTest20 {
    public static void main(String[] args) {
        //创建1个仓库对象，共享的
        List list=new ArrayList();
        //创建2个线程对象
        //生产者线程
        Thread t1=new Thread(new Producer(list));
        Thread t2=new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");

        t1.start();
        t2.start();


    }
}
//生产线程
class  Producer implements  Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产(使用死循环来模拟一直生产)
        while (true){
            //给仓库对象list加锁
            synchronized (list){
                if (list.size()>0){//大于0，说明仓库中已经有1个元素了
                    //当前线程进入等待状态，并且释放Producer之前占有的list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到这说明仓库是空的，可以生产
                Object obj=new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"----->"+obj);
                //唤醒消费者进行消费
                list.notify();

            }

        }
    }
}



//消费线程
class Consumer implements  Runnable{
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直消费
        while(true){
            synchronized (list){
                if (list.size()==0){
                    //仓库已经空了
                    //消费者线程等待，释放掉list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到此说明仓库中有数据，进行消费
                Object obj=list.remove(0);
                System.out.println(Thread.currentThread().getName()+"---->"+obj);
                //唤醒生产者生产
                list.notify();

            }
        }

    }
}
