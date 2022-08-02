package test15thread;

public class ThreadTest011 {
    public static void main(String[] args) {
        MyRunnable3 r=new MyRunnable3();
        Thread t=new Thread(r);
        t.setName("t");
        t.start();
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        //终止t的执行，那么你把标记修改为false,就结束了
        r.run=false;


    }
}

class  MyRunnable3 implements Runnable{
    //打一个boolean标记
    boolean run=true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //在这里可以保存
                //终止当前线程
                return;
            }
        }
    }
}
