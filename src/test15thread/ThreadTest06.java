package test15thread;

public class ThreadTest06 {
    public  void doSome(){
        //这样就不行了
//        this.getName();
//        super.getName();
        //但是这样可以
        String name=Thread.currentThread().getName();
        System.out.println("---->"+name);
    }
    public static void main(String[] args) {
        ThreadTest06 tt=new ThreadTest06();
        tt.doSome();

        //currentThread就是当前线程对象
        //这个方法出现在main方法中，所以当前线程就是主线程
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread.getName()); //main



        //创建线程对象
        MyThrad2 t=new MyThrad2();
        //设置线程名字
        t.setName("t1");
        //获取线程名字, 当线程没有设置名字的时候，默认的名字Thread-0,Thread-1
        String tname=t.getName();
        System.out.println(tname);

        //创建线程对象
        MyThrad2 t2=new MyThrad2();
        //设置线程名字
        t2.setName("t2");
        //获取线程名字, 当线程没有设置名字的时候，默认的名字Thread-0,Thread-1
        System.out.println(t2.getName());
        t2.start();


        //启动线程
        t.start();

    }
}
class MyThrad2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //当t1线程执行run方法，那么这个当前线程就是t1
            //当t2线程执行run方法，那么这个当前线程就是t2
            Thread currentThread=Thread.currentThread();
            System.out.println(currentThread.getName()+"---》"+i);
            //doSome方法解释为啥不应这用super,this
//            System.out.println(super.getName()+"---》"+i);
//            System.out.println(this.getName()+"---》"+i);
        }
    }
}