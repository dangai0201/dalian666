package test15thread.TreadSafe2;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象
    private Account act;
    //通过构造方法传递过来账户对象
    public AccountThread(Account act){
        this.act=act;
    }
    @Override
    public void run() {
        //run方法的执行表示取款操作
        double money=5000;
        //取款
        //这种方式也可以，只不过扩大了同步的范围，效率更低了
        synchronized (act){
            act.withdraw(money);
        }

        System.out.println(Thread.currentThread().getName()+"账户"+act.getActno()+"取款成功，余额："+act.getBalance());

    }
}
