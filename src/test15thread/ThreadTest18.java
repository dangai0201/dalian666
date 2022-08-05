package test15thread;
//juc包下的，属于java并发包
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
*实现线程的第三种方式：实现callable接口
*优点：可以获取到线程的执行结果
*缺点：效率较低，在获取t线程执行结果的时候，当前线程受阻塞，效率较低
* */
public class ThreadTest18 {
    public static void main(String[] args) throws Exception{
        //创建一个未来任务类对象
        //参数非常重要，需要给一个Callable接口实现类对象
        FutureTask task =new FutureTask(new Callable() {//call()方法相当于run方法，只不过这个有返回值
            @Override
            public Object call() throws Exception {
                //现成执行一个任务，执行之后可能会有一个执行结果
                System.out.println("call method begin");
                Thread.sleep(1000*5);
                System.out.println("call method over");
                int a=100;
                int b=200;
                return a+b;//自动装箱（结果变成Integer）
            }
        });

        //创建线程对象
        Thread t=new Thread(task);

        t.start();

        //这里是main方法，这里是主线程中
        //get()方法的执行会导致"当前线程的阻塞"
        Object obj=task.get();
        System.out.println("现成执行结果"+obj);

        //main方法这里的程序想要执行必须等待get()方法的结束
        //而get()方法可能需要很久，因为get()方法是为了拿另一个线程的执行结果
        //另一个i按成呢个执行是需要时间的
        System.out.println("hello dalian");

    }
}
