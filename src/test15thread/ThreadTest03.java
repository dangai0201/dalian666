package test15thread;

/*
*
* 采用匿名内部类的方式
*
* 线程对象的生命周期
* 新建状态
* 就绪状态
* 运行状态
* 阻塞状态
* 死亡状态
* */

public class ThreadTest03 {
    public static void main(String[] args) {
        //创建线程对象，采用匿名内部类方式
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程--》"+i);

                }
            }
        });
        //启动线程
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程--》"+i);

        }

    }
}
