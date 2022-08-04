package test15thread.TreadSafe2;
/*
* 银行账户
* 使用线程同步机制，解决线程安全问题
*
* java中有3大变量
* 1.实例变量 在堆中
* 2.静态变量 在方法区
* 3.局部变量 在栈中
*
* 局部变量永远不会存在线程安全问题
* 因为局部变量不共享（一个线程一个栈）
* 局部变量在栈中。所以局部变量永远不会共享
*
* 实例变量 在堆中，堆只有一个
* 静态变量在方法区中，方法区只有1个
* 堆和方法区都是多线程共享的，所以可能存在线程安全问题
*
* 局部变量+常量：不会有现成安全问题
* 成员变量：可能会有线程安全问题
*
*
* */

public class Account {
    //账号
    private String actno;
    //余额
    private double balance;//实例变量

    //对象
    Object obj=new Object();//实例变量（Account对象是多线程共享的，Account对象中的实例变量obj也是共享的）

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款的方法
    public void  withdraw(double money){

        //以下几行代码必须是线程排队的，不能并发
        //一个线程吧这里的代码全部执行结束之后，另一个线程才能进来
        /*
        * 线程同步机制
        *synchronized后面的小括号传的这个数据是相当关键的
        * 这个数据必须是多线程共享的数据，才能达到多线程排队
        * 假设t1，t2，t3有3个线程
        * t1，t2，排队，t3不排队
        * 在（）中写一个 t1，t2共享对象，而这个对象对于t3来说不是共享的
        *
        *
        * 这里的共享对象是：账户对象
        * 账户对象是共享的，那么this就是账户对象吧
        *
        * 在java语言中，任何一个对象都有"一把锁"，其实这把锁就是标记（只是把他叫做锁）
        * 100个对象，100吧锁
        * 以下代码原理：
        * 1.假设t1和t2线程并发，开始执行以下代码的时候，肯定是一个先，一个后
        * 2.假设t1先执行了，遇到了synchronized，这个时候自动找"后面的共享对象"的对象锁
        * 找到之后，并占有这把锁，然后执行同步代码快中的程序，在程序执行过程中一直都是占有这把锁的
        * 直到同步代码块代码结束，这把锁才会释放
        * 3.假设t1已经占有这把锁，此时t2也遇到synchronized关键子，也会去占有后面共享对象的这把锁
        * 结果这把锁被t1占有，t2只能在同步代码块外面等待t1结束，直到t1吧同步代码块执行结束了，t1回归还这把锁
        * 此时t2终于等到这把锁，然后t2占有这把锁之后，进入同步代码块执行程序
        *
        * 这样就达到了线程排队执行
        *注意：这个共享对象一定要选好了，这个共享对象一定是你需要排队执行的这些线程对象所共享的
        *
        * */
//        synchronized (this){
//        synchronized ("abc"){//"abc"在字符串常量池当中
//        synchronized (obj){
            //取款之前的余额
            double before=this.getBalance();
            //取款之后的余额
            double after=before-money;

            //这里模拟网络延迟，100%会出问题
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



            //更新余额
            this.setBalance(after);
//        }



    }
}
