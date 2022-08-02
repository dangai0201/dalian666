package test15thread;

/*
* sleep方法
* 静态方法
* 参数是毫秒
* 作用：让当前线程进入休眠，进入阻塞状态，放弃占有的cpu时间片，让给其他线程使用
*代码出现A线程中，A线程就会进入修庙
*代码出现B线程中，B线程就会进入修庙
*
* */
public class ThreadTest07 {
    public static void main(String[] args) {
        //让主线程进入休眠
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello dalian");


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            //睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
