package test15thread;
/*
* 强行终止一个线程执行
* 这种方式存在很大的缺点：容易丢失数据，因为这种方式是直接将线程杀死的
* 线程没有保存数据将会丢失，不建议使用
*
*
* */
public class ThreadTest010 {
    public static void main(String[] args) {
        Thread t=new Thread(new Myrunnable());
        t.setName("t");
        t.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //5秒之后强制终止t线程
        t.stop();//已过时（不建议使用）


    }
}
class Myrunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}