package test15thread.exam2;

/*
*因为MyClass对象是2个2吧锁，所以不需要等待doSome方法结束后再执行
* */
public class Exam01 {
    public static void main(String[] args) {
        MyClass mc1=new MyClass();
        MyClass mc2=new MyClass();

        Thread t1=new MyThread(mc1);
        Thread t2=new MyThread(mc2);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        //这个睡眠的作用：是为了保证t1线程先执行
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}

class  MyThread extends Thread{
    private MyClass mc;
    public MyThread(MyClass mc){
        this.mc=mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }

    }
}

class MyClass{
    public  synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");

    }
}
