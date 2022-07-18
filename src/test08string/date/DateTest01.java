package test08string.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        //获取系统当前时间（精确到毫秒的系统当前日期）
        Date nowTime=new Date();
        System.out.println(nowTime);

        //String-->date
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowTimeStr=sdf.format(nowTime);
        System.out.println(nowTimeStr);


        //String-->Date
        String time="2008-08-08 08:08:08 666";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime=sdf2.parse(time);
        System.out.println(dateTime);

        //获取自1970年1月1日 00：00：00到当前系统时间的总毫秒数
        long nowTimeMills=System.currentTimeMillis();
        System.out.println(nowTimeMills);

        long begin=System.currentTimeMillis();
        print();
        long end=System.currentTimeMillis();
        System.out.println("耗费时长"+(end-begin)+"毫秒");


        //1970-01-01 00:00:00 001
        Date time1=new Date(1);//参数是一个毫秒
        SimpleDateFormat sdf6=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str1=sdf6.format(time1);
        System.out.println(str1);


        //获取昨天的此时时间
        Date time2=new Date(System.currentTimeMillis()-1000*60*60*24);
        String str2=sdf6.format(time2);
        System.out.println(str2);




    }
    public static void print(){
        for (int i = 0; i < 1000; i++) {
//            System.out.println("i="+i);
        }
    }
}
