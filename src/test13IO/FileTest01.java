package test13IO;


/*
* File类和四大家族没关系，所以File类下不能完成文件的读和写
* File对象代表什么
* 文件和目录路径的抽象标识
* 一个File对象有可能对应的是目录，也可能是文件
* File只是一个路径名的抽象标识
*
* */

import java.io.File;

public class FileTest01 {
    public static void main(String[] args) throws Exception{
        //创建一个File对象
        File f1=new File("/Users/yuliguo/Desktop/dalianpro");
        //判断是否存在
        System.out.println(f1.exists());
        //如果不存在，则以文件的形式创建出来
        /*
        if (!f1.exists()){
            f1.createNewFile();
        }
        */
        //以目录的形式创建出来
        /*
        if (!f1.exists()){
            f1.mkdir();
        }
        */
        //以多重目录的形式创建出来
        /*
        File f2=new File("/Users/yuliguo/Desktop/dalianpro/dalianren/dalian");
        if (!f1.exists()){
            //以多重目录的形式创建
            f2.mkdirs();
        }
        */

        File f3=new File("/Users/yuliguo/Downloads/大连球迷观赏.mp4");
        //获取文件的父路径
        String aaa=f3.getParent();
        System.out.println(aaa);
        File bbb=f3.getParentFile();
        System.out.println("获取绝对路径:"+bbb.getAbsolutePath());




    }



}
