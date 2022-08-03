package test15thread.TreadSafe2;

public class Test {
    public static void main(String[] args) {
        //创建账户对象
        Account act =new Account("act-001",10000);
        //创建2个线程
        Thread t1=new AccountThread(act);
        Thread t2=new AccountThread(act);
        //设置name
        t1.setName("t1");
        t2.setName("t2");
        //启动线程取款
        t1.start();
        t2.start();

    }
}
