package test15thread.ThreadSafe3;
/*
* 银行账户
* 不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
* */

public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

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
    //synchronized出现在实例方法上，一定锁的的是this
    //没得挑，只能this，不能是其他的对象了，所以这种方式不灵活
    //synchronized出现在实例方法上，表示整个方法体都需要同步，可能会无故扩大同步的范围，导致程序的执行效率降低，这种方式不常用

    //优点：代码写的少了，节俭了。

    public synchronized void  withdraw(double money){
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
    }
}
