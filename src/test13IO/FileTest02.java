package test13IO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* File类常用方法
* */
public class FileTest02 {
    public static void main(String[] args) {
        File f1=new File("/Users/yuliguo/Downloads/大连球迷观赏.mp4");
        //获取文件名
        System.out.println("文件名："+f1.getName());
        //判断是否是一个目录
        System.out.println(f1.isDirectory());
        //判断是否是一个文件
        System.out.println(f1.isFile());
        //获取文件最后一次修改时间
        long haomiao=f1.lastModified();//这个毫秒是从1970年到现在的总毫秒数
        Date time=new Date(haomiao);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime=sdf.format(time);
        System.out.println(strTime);
        //获取文件
        System.out.println(f1.length());

        File f2=new File("/Users/yuliguo/Downloads/");
        //获取当前目录下所有的子文件
        File[] files=f2.listFiles();
        for(File file:files){
//            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }

    }
}
