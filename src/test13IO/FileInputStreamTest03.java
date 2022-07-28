package test13IO;

/*
*int read(byte[] b)
* 一次最多读取b.length()个字节
* 减少硬盘和内存的交互，提高程序的执行效率
* 往byte[]数组中读
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            //相对路径一定是从当前所在位置作为起点开始找！
            //工程project的根就是IDEA的默认当前路径
//            fis=new FileInputStream("src/IOTEST/dalian");
            fis=new FileInputStream("C:\\Users\\admin\\Desktop\\abc.txt");
            //开始读，采用byte数组，一次读取多个字节，最多读取“数组.length”个字节
            byte[] bytes=new byte[4];



            /*//这个方法的返回值是：读取到字节数量（不是字节本身）
            int readCount=fis.read(bytes);
            System.out.println(readCount);
//            //将字节数组全部转换成字符串
//            System.out.println(new String(bytes));
            //应该读取多少个字节，转换多少个
            System.out.println(new String(bytes,0,readCount));


            readCount=fis.read(bytes);
            System.out.println(readCount);
//            //将字节数组全部转换成字符串
//            System.out.println(new String(bytes));
            //应该读取多少个字节，转换多少个
            System.out.println(new String(bytes,0,readCount));*/


            /*while(true){
                int readCount=fis.read(bytes);
                if (readCount==-1){
                    break;
                }
                //byte数组转换成字符串，读到多少转多少
                System.out.print(new String(bytes,0,readCount));
            }*/

            int readCount=0;
            while ((readCount=fis.read(bytes))!=-1){
                System.out.print(new String(bytes,0,readCount));
            }









        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
