package test15thread;

/*
*
* 使用定时器指定定时任务
* */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest17 {
    public static void main(String[] args) throws Exception {
        //创建定时器对象
        Timer timer=new Timer();
//        Timer timer=new Timer(true);//守护线程的方式
        //置顶定时任务
//        timer.schedule(定时任务对象，第一次执行事件，间隔多久执行一次);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date fisrtTime= sdf.parse("2022-08-05 17:32:00");

        timer.schedule(new LogTimerTask(),fisrtTime,1000*10);
        //匿名内部类的方式
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
            }
        },fisrtTime,1000*10);
    }
}

//编写一个定时任务类
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        //编写需要执行的任务
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime= sdf.format(new Date());
        System.out.println(strTime+"成功完成了一次备份！");


    }
}